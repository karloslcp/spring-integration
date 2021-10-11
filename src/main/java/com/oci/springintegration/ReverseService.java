package com.oci.springintegration;

public class ReverseService
{
    public String reverse(String message)
    {
        System.out.println("reverseService " + message);
        return new StringBuilder(message).reverse().toString();
    }
}
