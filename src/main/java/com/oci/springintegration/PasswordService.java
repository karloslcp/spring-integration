package com.oci.springintegration;

import org.springframework.stereotype.Service;

@Service
public class PasswordService
{
    public Password generatePassword(Person person)
    {
        String password = new StringBuilder(person.getFirstName())
            .append(person.getLastName())
            .reverse()
            .append("123")
            .toString();

        return new Password(password.length(), password);
    }
}
