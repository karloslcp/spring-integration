package com.oci.springintegration;

import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class MotherFuckingFilter
{
    public boolean accept(@Header(value = "hola", required = false, defaultValue = "") final String hola)
    {
        if (hola.equals("que haces?"))
        {
            return true;
        }
        return false;
    }
}
