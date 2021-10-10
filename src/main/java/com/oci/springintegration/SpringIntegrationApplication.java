package com.oci.springintegration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner
{
	@Autowired
	private PrinterGateway gateway;

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationApplication.class, args);
	}

	@Override
	public void run(final ApplicationArguments args) throws Exception
	{
		List<Future<Message<String>>> futures = new ArrayList<>();

		for (int i = 0; i < 10; i++)
		{
			Message<String> message = MessageBuilder
				.withPayload("[PrinterService] Printing message payload for " + i)
				.setHeader("messageNumber", i)
				.build();

			System.out.println("[main] Sending message " + i);
			futures.add(gateway.print(message));
		}

		// TODO: why messages are not polled in order???
		for (Future<Message<String>> future : futures)
		{
			System.out.println(future.get().getPayload());
		}
	}
}
