package com.esosa.dungeonsanddragonscharactersheet.dto.character.abilityscore;
public class StatsDTO {
    StatsAuxDTO strength;
    StatsAuxDTO dexterity;
    StatsAuxDTO constitution;
    StatsAuxDTO intelligence;
    StatsAuxDTO wisdom;
    StatsAuxDTO charisma;

    public StatsDTO() {
    }

    public StatsAuxDTO getStrength() {
        return strength;
    }

    public void setStrength(StatsAuxDTO strength) {
        this.strength = strength;
    }

    public StatsAuxDTO getDexterity() {
        return dexterity;
    }

    public void setDexterity(StatsAuxDTO dexterity) {
        this.dexterity = dexterity;
    }

    public StatsAuxDTO getConstitution() {
        return constitution;
    }

    public void setConstitution(StatsAuxDTO constitution) {
        this.constitution = constitution;
    }

    public StatsAuxDTO getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(StatsAuxDTO intelligence) {
        this.intelligence = intelligence;
    }

    public StatsAuxDTO getWisdom() {
        return wisdom;
    }

    public void setWisdom(StatsAuxDTO wisdom) {
        this.wisdom = wisdom;
    }

    public StatsAuxDTO getCharisma() {
        return charisma;
    }

    public void setCharisma(StatsAuxDTO charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return "StatsDTO{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }
}
