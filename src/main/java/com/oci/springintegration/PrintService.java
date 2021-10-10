package com.oci.springintegration;

import static java.lang.String.format;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

public class PrintService
{
    public Message<?> print(Message<String> message)
    {
        MessageHeaders headers = message.getHeaders();
        String payload = message.getPayload();

        headers.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
        System.out.println(payload);

        return MessageBuilder
            .withPayload(format("Message with payload [%s] has been processed.", payload))
            .build();
    }
}
