package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.abilityscore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "stats_aux")
public class StatsAux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Min(value = 1, message = "Stats cannot be smaller than 1")
    @Max(value = 30, message = "Stats cannot be bigger than 30")
    @Column(name = "value")
    private int value;

    @Min(value = -5, message = "Modifiers cannot be smaller than -5")
    @Max(value = 10, message = "Modifiers cannot be bigger than 10")
    @Column(name = "bonus")
    private int bonus;

    public StatsAux() {
    }

    public StatsAux(int value, int bonus) {
        this.value = value;
        this.bonus = bonus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "StatsAux{" +
                "value=" + value +
                ", bonus=" + bonus +
                '}';
    }
}
