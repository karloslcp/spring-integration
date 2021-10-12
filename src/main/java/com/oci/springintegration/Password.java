package com.oci.springintegration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Password
{
    private int length;

    private String value;
}
