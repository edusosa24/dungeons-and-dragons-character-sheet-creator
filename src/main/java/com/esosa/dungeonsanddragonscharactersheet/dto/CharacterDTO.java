package com.esosa.dungeonsanddragonscharactersheet.dto;

import com.esosa.dungeonsanddragonscharactersheet.dto.character.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CharacterDTO {
    Long id;
    @Size(message = "Character name can be 64 characters long max", max = 64)
    @Pattern(message = "Character name should only contain letters and numbers and spaces", regexp = "^(|[a-zA-Z0-9\\s]+)$")
    String name;
    AbilityScoreDTO abilityScore;
    CombatDTO combat;
    SpellsDTO spells;
    GeneralDTO general;
    EquipmentAndMoneyDTO equipmentAndMoney;
    AppearanceDTO appearance;
    BackstoryDTO backstory;
    FeaturesTraitsAndOtherProficienciesDTO featuresTraitsAndOtherProficiencies;

    public CharacterDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbilityScoreDTO getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(AbilityScoreDTO abilityScore) {
        this.abilityScore = abilityScore;
    }

    public CombatDTO getCombat() {
        return combat;
    }

    public void setCombat(CombatDTO combat) {
        this.combat = combat;
    }

    public SpellsDTO getSpells() {
        return spells;
    }

    public void setSpells(SpellsDTO spells) {
        this.spells = spells;
    }

    public GeneralDTO getGeneral() {
        return general;
    }

    public void setGeneral(GeneralDTO general) {
        this.general = general;
    }

    public EquipmentAndMoneyDTO getEquipmentAndMoney() {
        return equipmentAndMoney;
    }

    public void setEquipmentAndMoney(EquipmentAndMoneyDTO equipmentAndMoney) {
        this.equipmentAndMoney = equipmentAndMoney;
    }

    public AppearanceDTO getAppearance() {
        return appearance;
    }

    public void setAppearance(AppearanceDTO appearance) {
        this.appearance = appearance;
    }

    public BackstoryDTO getBackstory() {
        return backstory;
    }

    public void setBackstory(BackstoryDTO backstory) {
        this.backstory = backstory;
    }

    public FeaturesTraitsAndOtherProficienciesDTO getFeaturesTraitsAndOtherProficiencies() {
        return featuresTraitsAndOtherProficiencies;
    }

    public void setFeaturesTraitsAndOtherProficiencies(FeaturesTraitsAndOtherProficienciesDTO featuresTraitsAndOtherProficiencies) {
        this.featuresTraitsAndOtherProficiencies = featuresTraitsAndOtherProficiencies;
    }

    @Override
    public String toString() {
        return "CharacterDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abilityScore=" + abilityScore +
                ", combat=" + combat +
                ", spells=" + spells +
                ", general=" + general +
                ", equipmentAndMoney=" + equipmentAndMoney +
                ", appearance=" + appearance +
                ", backstory=" + backstory +
                ", featuresTraitsAndOtherProficiencies=" + featuresTraitsAndOtherProficiencies +
                '}';
    }
}
