package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "spell_known")
public class SpellKnown {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "level")
    @Min(value = 1, message = "Spell Level cannot be smaller than 1")
    @Max(value = 9, message = "Spell Level cannot be bigger than 9")
    private int level;

    @Column(name = "name")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s]+)$", message = "Spell name can only contain letters, numbers and spaces")
    @Size(max = 255, message = "Spell name can be 255 character long max")
    private String name;

    @Column(name = "prepared")
    private boolean prepared;

    public SpellKnown() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    @Override
    public String toString() {
        return "SpellKnown{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", prepared=" + prepared +
                '}';
    }
}
