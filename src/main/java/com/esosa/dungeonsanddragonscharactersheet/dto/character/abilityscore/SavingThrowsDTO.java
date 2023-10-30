package com.esosa.dungeonsanddragonscharactersheet.dto.character.abilityscore;

public class SavingThrowsDTO {
    SavingThrowsAndSkillsAuxDTO strength;
    SavingThrowsAndSkillsAuxDTO dexterity;
    SavingThrowsAndSkillsAuxDTO constitution;
    SavingThrowsAndSkillsAuxDTO intelligence;
    SavingThrowsAndSkillsAuxDTO wisdom;
    SavingThrowsAndSkillsAuxDTO charisma;

    public SavingThrowsDTO() {
    }

    public SavingThrowsAndSkillsAuxDTO getStrength() {
        return strength;
    }

    public void setStrength(SavingThrowsAndSkillsAuxDTO strength) {
        this.strength = strength;
    }

    public SavingThrowsAndSkillsAuxDTO getDexterity() {
        return dexterity;
    }

    public void setDexterity(SavingThrowsAndSkillsAuxDTO dexterity) {
        this.dexterity = dexterity;
    }

    public SavingThrowsAndSkillsAuxDTO getConstitution() {
        return constitution;
    }

    public void setConstitution(SavingThrowsAndSkillsAuxDTO constitution) {
        this.constitution = constitution;
    }

    public SavingThrowsAndSkillsAuxDTO getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(SavingThrowsAndSkillsAuxDTO intelligence) {
        this.intelligence = intelligence;
    }

    public SavingThrowsAndSkillsAuxDTO getWisdom() {
        return wisdom;
    }

    public void setWisdom(SavingThrowsAndSkillsAuxDTO wisdom) {
        this.wisdom = wisdom;
    }

    public SavingThrowsAndSkillsAuxDTO getCharisma() {
        return charisma;
    }

    public void setCharisma(SavingThrowsAndSkillsAuxDTO charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return "SavingThrowsDTO{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }
}
