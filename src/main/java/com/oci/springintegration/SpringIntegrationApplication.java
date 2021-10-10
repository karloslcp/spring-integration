package com.oci.springintegration;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner
{
    @Autowired
    private DirectChannel channel;

    public static void main(String[] args)
    {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    @Override
    public void run(final ApplicationArguments args) throws Exception
    {
        PrintService printService = new PrintService();

        // Creating a message - version 1
        Map<String, Object> map = Collections.singletonMap("Ola", "k ase?");
        MessageHeaders headers = new MessageHeaders(map);
        String payload = "Hello, World!";

        Message<String> message1 = new GenericMessage<>(payload, headers);

        printService.print(message1);

        // Creating a message - version 2
        Message<String> message2 = MessageBuilder
            .withPayload("Hola, Mundo!")
            .setHeader("Hola", "qué haces?")
            .build();

        printService.print(message2);

        // Creating a message - version 3
        Message<String> message3 = MessageBuilder
            .withPayload("Priviet, Worldu!")
            .setHeader("Zdravstvui", "shto ti?")
            .build();

//        channel.subscribe((message) -> new PrintService().print((Message<String>) message));
        channel.subscribe(new MessageHandler()
        {
            @Override
            public void handleMessage(final Message<?> message) throws MessagingException
            {
                new PrintService().print((Message<String>) message);
            }
        });
        channel.send(message3);
    }
}
