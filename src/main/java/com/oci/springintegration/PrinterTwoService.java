package com.oci.springintegration;

public class PrinterTwoService
{
    public String print(String message)
    {
        System.out.println("two " + message.substring(message.length() - 2));
        return "From printerTwo " + message;
    }
}
