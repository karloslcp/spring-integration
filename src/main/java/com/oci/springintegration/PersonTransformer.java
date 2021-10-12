package com.oci.springintegration;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonTransformer
{
    @Mapping(target = "name", source = "name")
    PersonDto transform(Person person);

    default String nameToString(Name name)
    {
        return name.getLastName() + ", " + name.getFirstName();
    }
}
