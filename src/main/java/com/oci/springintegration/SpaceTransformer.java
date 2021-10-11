package com.oci.springintegration;

import org.springframework.stereotype.Component;

@Component
public class SpaceTransformer
{
    public String transform(String message)
    {
        String returnString = "";
        for (char c : message.toCharArray())
        {
            returnString += c + " ";
        }
        return returnString;
    }
}
