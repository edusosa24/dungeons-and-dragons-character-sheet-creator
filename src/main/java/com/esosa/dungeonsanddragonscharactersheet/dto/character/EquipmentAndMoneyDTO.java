package com.esosa.dungeonsanddragonscharactersheet.dto.character;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

public class EquipmentAndMoneyDTO {

    @Min(message = "Copper cannot be smaller than 0", value = 0)
    @Max(message = "Copper cannot be bigger than 9999", value = 9999)
    Integer copper;
    @Min(message = "Silver cannot be smaller than 0", value = 0)
    @Max(message = "Silver cannot be bigger than 9999", value = 9999)
    Integer silver;
    @Min(message = "Electrum cannot be smaller than 0", value = 0)
    @Max(message = "Electrum cannot be bigger than 9999", value = 9999)
    Integer electrum;
    @Min(message = "Gold cannot be smaller than 0", value = 0)
    @Max(message = "Gold cannot be bigger than 9999", value = 9999)
    Integer gold;
    @Min(message = "Platinum cannot be smaller than 0", value = 0)
    @Max(message = "Platinum cannot be bigger than 9999", value = 9999)
    Integer platinum;
    @Pattern(message = "Equipment can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$")
    String equipment;

    public EquipmentAndMoneyDTO() {
    }

    public Integer getCopper() {
        return copper;
    }

    public void setCopper(Integer copper) {
        this.copper = copper;
    }

    public Integer getSilver() {
        return silver;
    }

    public void setSilver(Integer silver) {
        this.silver = silver;
    }

    public Integer getElectrum() {
        return electrum;
    }

    public void setElectrum(Integer electrum) {
        this.electrum = electrum;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getPlatinum() {
        return platinum;
    }

    public void setPlatinum(Integer platinum) {
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
        return "EquipmentAndMoneyDTO{" +
                "copper=" + copper +
                ", silver=" + silver +
                ", electrum=" + electrum +
                ", gold=" + gold +
                ", platinum=" + platinum +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}
