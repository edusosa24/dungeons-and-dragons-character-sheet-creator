package com.esosa.dungeonsanddragonscharactersheet.dto.character.spells;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class SpellSlotsDTO {

    @Min(message = "SpellSlotLevel cannot be smaller than 1", value = 1)
    @Max(message = "SpellSlotLevel cannot be bigger than 9", value = 9)
    Integer level;
    @Min(message = "SpellSlotTotal cannot be smaller than 0", value = 0)
    @Max(message = "SpellSlotTotal cannot be bigger than 30", value = 30)
    Integer total;
    @Min(message = "Spell Level cannot be smaller than 1", value = 0)
    @Max(message = "Spell Level cannot be bigger than 9", value = 30)
    Integer expended;

    public SpellSlotsDTO() {
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getExpended() {
        return expended;
    }

    public void setExpended(Integer expended) {
        this.expended = expended;
    }

    @Override
    public String toString() {
        return "SpellSlotsDTO{" +
                "level=" + level +
                ", total=" + total +
                ", expended=" + expended +
                '}';
    }
}
