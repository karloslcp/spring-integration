package com.oci.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class PrintService
{
    public void print(Message<String> message)
    {
        MessageHeaders headers = message.getHeaders();
        String payload = message.getPayload();

        headers.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
        System.out.println(payload);
    }
}
