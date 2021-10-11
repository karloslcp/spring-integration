package com.oci.springintegration;

public class InterceptorService
{
    public String intercept(String message)
    {
        System.out.println("interceptorService " + message);
        return "Intercepted message = " + message;
    }
}
