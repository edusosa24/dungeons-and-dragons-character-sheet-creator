package com.esosa.dungeonsanddragonscharactersheet.dto.character.spells;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class SpellKnownDTO {

    @Min(message = "Spell Level cannot be smaller than 1", value = 1)
    @Max(message = "Spell Level cannot be bigger than 9", value = 9)
    Integer level;
    @Size(message = "Spell name can be 255 character long max", max = 255)
    @Pattern(message = "Spell name can only contain letters, numbers and spaces", regexp = "^(|[A-Za-z0-9\\s]+)$")
    String name;
    Boolean prepared;

    public SpellKnownDTO() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(Boolean prepared) {
        this.prepared = prepared;
    }

    @Override
    public String toString() {
        return "SpellKnownDTO{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", prepared=" + prepared +
                '}';
    }
}
