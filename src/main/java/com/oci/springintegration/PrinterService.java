package com.oci.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class PrinterService
{
    public Message<String> print(Message<String> message)
    {
        System.out.println(message.getPayload());
        int messageNumber = (int) message.getHeaders().get("messageNumber");
        return MessageBuilder.withPayload("[futures] Sending reply for message " + messageNumber).build();
    }
}
