package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "equipment_and_money")
public class EquipmentAndMoney {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "copper")
    @Min(value = 0, message = "Copper cannot be smaller than 0")
    @Max(value = 9999, message = "Copper cannot be bigger than 9999")
    private int copper;

    @Column(name = "silver")
    @Min(value = 0, message = "Silver cannot be smaller than 0")
    @Max(value = 9999, message = "Silver cannot be bigger than 9999")
    private int silver;

    @Column(name = "electrum")
    @Min(value = 0, message = "Electrum cannot be smaller than 0")
    @Max(value = 9999, message = "Electrum cannot be bigger than 9999")
    private int electrum;

    @Column(name = "gold")
    @Min(value = 0, message = "Gold cannot be smaller than 0")
    @Max(value = 9999, message = "Gold cannot be bigger than 9999")
    private int gold;

    @Column(name = "platinum")
    @Min(value = 0, message = "Platinum cannot be smaller than 0")
    @Max(value = 9999, message = "Platinum cannot be bigger than 9999")
    private int platinum;

    @Column(name = "equipment")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$", message = "Equipment can only contain letters, numbers, spaces and .,!?+-")
    private String equipment;

    public EquipmentAndMoney() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCopper() {
        return copper;
    }

    public void setCopper(int copper) {
        this.copper = copper;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getElectrum() {
        return electrum;
    }

    public void setElectrum(int electrum) {
        this.electrum = electrum;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPlatinum() {
        return platinum;
    }

    public void setPlatinum(int platinum) {
        this.platinum = platinum;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "EquipmentAndMoney{" +
                "copper=" + copper +
                ", silver=" + silver +
                ", electrum=" + electrum +
                ", gold=" + gold +
                ", platinum=" + platinum +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}

