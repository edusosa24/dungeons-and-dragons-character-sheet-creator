package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells;

import jakarta.persistence.*;

@Entity
@Table(name = "spell_slots")
public class SpellSlots {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "level")
    private int level;

    @Column(name = "total")
    private int total;

    @Column(name = "expended")
    private int expended;

    public SpellSlots() {
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getExpended() {
        return expended;
    }

    public void setExpended(int expended) {
        this.expended = expended;
    }

    @Override
    public String toString() {
        return "SpellSlots{" +
                "level=" + level +
                ", total=" + total +
                ", expended=" + expended +
                '}';
    }
}
