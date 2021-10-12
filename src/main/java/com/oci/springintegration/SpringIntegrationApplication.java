package com.oci.springintegration;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@AllArgsConstructor
@ImportResource("classpath:integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner
{
	private PersonGateway gateway;

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationApplication.class, args);
	}

	@Override
	public void run(final ApplicationArguments args) throws Exception
	{
		System.out.println(gateway.personify(new Person(7, "Karlos", "Chita", "")));
	}
}
