package com.oci.springintegration;

public class ExtraService
{
    public String print(String message)
    {
        String str = "EXTRA of " + message;
        System.out.println(str);
        return str;
    }
}
