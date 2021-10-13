package com.oci.springintegration;

import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class FuckingService
{
    public void doFuckingSomething(MessageHeaders headers, Fucker fucker)
    {
        headers.forEach((s, o) -> System.out.println(s.concat(":").concat(o.toString())));
        System.out.println();
        System.out.println(fucker);
    }
}
