package com.oci.springintegration;

import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

public interface FuckingGateway
{
    void fuckingMethod(
        @Header(name = "ola", required = false) final String ola,
        @Header(name = "hola", required = false) final String hola,
        @Payload final Fucker fucker);
}
