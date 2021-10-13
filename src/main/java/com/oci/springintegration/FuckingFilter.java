package com.oci.springintegration;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class FuckingFilter implements MessageSelector
{
    @Override
    public boolean accept(final Message<?> message)
    {
        if (message.getHeaders().containsKey("ola") && message.getHeaders().get("ola").equals("k ase?"))
        {
            return true;
        }
        return false;
    }
}
