package com.esosa.dungeonsanddragonscharactersheet.dto.character.abilityscore;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class SavingThrowsAndSkillsAuxDTO {

    Boolean proficiency;
    @Min(message = "Modifiers cannot be smaller than -5", value = -5)
    @Max(message = "Modifiers cannot be bigger than 10", value = 10)
    Integer bonus;

    public SavingThrowsAndSkillsAuxDTO() {
    }

    public Boolean getProficiency() {
        return proficiency;
    }

    public void setProficiency(Boolean proficiency) {
        this.proficiency = proficiency;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "SavingThrowsAndSkillsAuxDTO{" +
                "proficiency=" + proficiency +
                ", bonus=" + bonus +
                '}';
    }
}
