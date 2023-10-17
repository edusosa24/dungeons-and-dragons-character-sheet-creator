package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;

@Entity
@Table(name = "equipment_and_money")
public class EquipmentAndMoney {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "copper")
    private int copper;

    @Column(name = "silver")
    private int silver;

    @Column(name = "electrum")
    private int electrum;

    @Column(name = "gold")
    private int gold;

    @Column(name = "platinum")
    private int platinum;

    @Column(name = "equipment")
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

