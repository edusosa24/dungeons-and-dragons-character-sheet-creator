package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "spell_slots")
public class SpellSlots {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "level")
    @Min(value = 1, message = "SpellSlotLevel cannot be smaller than 1")
    @Max(value = 9, message = "SpellSlotLevel cannot be bigger than 9")
    private int level;

    @Column(name = "total")
    @Min(value = 0, message = "SpellSlotTotal cannot be smaller than 0")
    @Max(value = 30, message = "SpellSlotTotal cannot be bigger than 30")
    private int total;

    @Column(name = "expended")
    @Min(value = 0, message = "Spell Level cannot be smaller than 1")
    @Max(value = 30, message = "Spell Level cannot be bigger than 9")
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
