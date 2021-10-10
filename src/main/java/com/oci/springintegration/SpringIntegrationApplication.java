package com.oci.springintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner
{
    @Autowired
    private CustomGateway gateway;

    public static void main(String[] args)
    {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    @Override
    public void run(final ApplicationArguments args) throws Exception
    {
        gateway.print("Hello, World!");
        gateway.print("Ola k ase?");
        gateway.print("Ola k ase?");
        gateway.print("Hello, World!");
    }
}
