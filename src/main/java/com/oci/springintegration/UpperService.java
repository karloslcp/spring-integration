package com.oci.springintegration;

public class UpperService
{
    public String print(String message)
    {
        System.out.println("upperService " + message);
        return message.toUpperCase();
    }
}
