package com.esosa.dungeonsanddragonscharactersheet.dto.character.abilityscore;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class StatsAuxDTO {

    @Min(message = "Stats cannot be smaller than 1", value = 1)
    @Max(message = "Stats cannot be bigger than 30", value = 30)
    Integer value;
    @Min(message = "Modifiers cannot be smaller than -5", value = -5)
    @Max(message = "Modifiers cannot be bigger than 10", value = 10)
    Integer bonus;

    public StatsAuxDTO() {
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "StatsAuxDTO{" +
                "value=" + value +
                ", bonus=" + bonus +
                '}';
    }
}
