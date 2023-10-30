package com.esosa.dungeonsanddragonscharactersheet.dto.character;

import com.esosa.dungeonsanddragonscharactersheet.dto.character.abilityscore.SavingThrowsDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.character.abilityscore.SkillsDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.character.abilityscore.StatsDTO;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class AbilityScoreDTO {

    @Min(message = "Inspiration cannot be smaller than 0", value = 0)
    @Max(message = "Inspiration cannot be bigger than 999", value = 999)
    Integer inspiration;
    @Min(message = "ProficiencyBonus cannot be smaller than 0", value = 0)
    @Max(message = "ProficiencyBonus cannot be bigger than 999", value = 999)
    Integer proficiencyBonus;
    @Min(message = "PassiveWisdom cannot be smaller than 0", value = 0)
    @Max(message = "PassiveWisdom cannot be bigger than 999", value = 999)
    Integer passiveWisdom;
    StatsDTO stats;
    SkillsDTO skills;
    SavingThrowsDTO savingThrows;

    public AbilityScoreDTO() {
    }

    public Integer getInspiration() {
        return inspiration;
    }

    public void setInspiration(Integer inspiration) {
        this.inspiration = inspiration;
    }

    public Integer getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(Integer proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public Integer getPassiveWisdom() {
        return passiveWisdom;
    }

    public void setPassiveWisdom(Integer passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }

    public StatsDTO getStats() {
        return stats;
    }

    public void setStats(StatsDTO stats) {
        this.stats = stats;
    }

    public SkillsDTO getSkills() {
        return skills;
    }

    public void setSkills(SkillsDTO skills) {
        this.skills = skills;
    }

    public SavingThrowsDTO getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(SavingThrowsDTO savingThrows) {
        this.savingThrows = savingThrows;
    }

    @Override
    public String toString() {
        return "AbilityScoreDTO{" +
                "inspiration=" + inspiration +
                ", proficiencyBonus=" + proficiencyBonus +
                ", passiveWisdom=" + passiveWisdom +
                ", stats=" + stats +
                ", skills=" + skills +
                ", savingThrows=" + savingThrows +
                '}';
    }
}
