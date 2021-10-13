package com.oci.springintegration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FuckingController
{
    private FuckingGateway fuckingGateway;

    @PostMapping
    public void someFuckingEndpoint(@RequestHeader(required = false) String ola, @RequestHeader(required = false) String hola, @RequestBody Fucker fucker)
    {
        fuckingGateway.fuckingMethod(ola, hola, fucker);
    }
}
