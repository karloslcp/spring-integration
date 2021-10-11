package com.oci.springintegration;

import org.springframework.messaging.Message;

public interface PrinterGateway
{
    Message<String> print(String message);
}
