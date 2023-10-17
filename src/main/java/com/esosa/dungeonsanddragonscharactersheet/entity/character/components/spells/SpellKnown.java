package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells;

import jakarta.persistence.*;

@Entity
@Table(name = "spell_known")
public class SpellKnown {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "level")
    private int level;

    @Column(name = "name")
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
