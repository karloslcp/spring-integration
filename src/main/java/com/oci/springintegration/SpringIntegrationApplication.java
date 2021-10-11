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
	private PrinterGateway gateway;

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationApplication.class, args);
	}

	@Override
	public void run(final ApplicationArguments args) throws Exception
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("En main!!! " + gateway.print("Ola k ase? " + i).getPayload());
		}
	}
}
