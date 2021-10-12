package com.oci.springintegration;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person
{
    private int id;

    private Name name;

    private LocalDate dateOfBirth;
}
