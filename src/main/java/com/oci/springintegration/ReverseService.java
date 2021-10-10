package com.oci.springintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ReverseService.class);

    public void reverse(String string)
    {
        LOGGER.info(new StringBuilder(string).reverse().toString());
    }
}
