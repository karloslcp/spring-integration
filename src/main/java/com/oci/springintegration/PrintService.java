package com.oci.springintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintService.class);

    public void print(String string)
    {
        LOGGER.info(string);
    }
}
