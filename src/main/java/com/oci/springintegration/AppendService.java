package com.oci.springintegration;

public class AppendService
{
    public String append(String message)
    {
        System.out.println("appendService " + message);
        return "Append " + message;
    }
}
