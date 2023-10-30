package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.Spells;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cantrip")
public class Cantrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s]+)$", message = "Cantrip can only contain letters, numbers and spaces")
    @Size(max = 255, message = "Cantrip name can be 255 character long max")
    private String name;

    public Cantrip() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cantrip{" +
                "name='" + name + '\'' +
                '}';
    }
}
