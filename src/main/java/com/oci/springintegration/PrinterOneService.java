package com.oci.springintegration;

public class PrinterOneService
{
    public String print(String message)
    {
        System.out.println("one " + message.substring(message.length() - 2));
        return "From printerOne " + message;
    }
}
