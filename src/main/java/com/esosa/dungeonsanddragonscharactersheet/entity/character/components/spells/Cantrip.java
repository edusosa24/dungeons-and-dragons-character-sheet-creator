package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells;

import jakarta.persistence.*;

@Entity
@Table(name = "cantrip")
public class Cantrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
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
