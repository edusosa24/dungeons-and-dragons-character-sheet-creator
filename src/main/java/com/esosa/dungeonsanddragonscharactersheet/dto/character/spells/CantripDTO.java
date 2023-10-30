package com.esosa.dungeonsanddragonscharactersheet.dto.character.spells;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CantripDTO {

    @Size(message = "Cantrip name can be 255 character long max", max = 255)
    @Pattern(message = "Cantrip can only contain letters, numbers and spaces", regexp = "^(|[A-Za-z0-9\\s]+)$")
    String name;

    public CantripDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CantripDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
