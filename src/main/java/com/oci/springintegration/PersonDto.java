package com.oci.springintegration;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonDto
{
    private int id;

    private String name;

    private Date dateOfBirth;
}
