package com.esosa.dungeonsanddragonscharactersheet.dto.character;

import com.esosa.dungeonsanddragonscharactersheet.dto.character.spells.CantripDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.character.spells.SpellKnownDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.character.spells.SpellSlotsDTO;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

public class SpellsDTO {

    @Size(message = "SpellcastingClass can be 64 character long max", max = 64)
    @Pattern(message = "SpellcastingClass can only contain letters and numbers, spaces and ?+-", regexp = "^(|[A-Za-z0-9\\s?+-]+)$")
    String spellcastingClass;
    @Size(message = "SpellcastingAbility can be 16 character long max", max = 16)
    @Pattern(message = "SpellcastingAbility can only contain letters and numbers, spaces and ?+-", regexp = "^(|[A-Za-z0-9\\s?+-]+)$")
    String spellcastingAbility;
    @Min(message = "SpellSaveDc cannot be smaller than 0", value = 0)
    @Max(message = "SpellSaveDc cannot be bigger than 999", value = 999)
    Integer spellSaveDc;
    @Min(message = "SpellBonusAttack cannot be smaller than 0", value = 0)
    @Max(message = "SpellBonusAttack cannot be bigger than 999", value = 999)
    Integer spellBonusAttack;
    List<CantripDTO> cantrips;
    List<SpellSlotsDTO> spellSlots;
    List<SpellKnownDTO> spellsKnown;

    public SpellsDTO() {
    }

    public String getSpellcastingClass() {
        return spellcastingClass;
    }

    public void setSpellcastingClass(String spellcastingClass) {
        this.spellcastingClass = spellcastingClass;
    }

    public String getSpellcastingAbility() {
        return spellcastingAbility;
    }

    public void setSpellcastingAbility(String spellcastingAbility) {
        this.spellcastingAbility = spellcastingAbility;
    }

    public Integer getSpellSaveDc() {
        return spellSaveDc;
    }

    public void setSpellSaveDc(Integer spellSaveDc) {
        this.spellSaveDc = spellSaveDc;
    }

    public Integer getSpellBonusAttack() {
        return spellBonusAttack;
    }

    public void setSpellBonusAttack(Integer spellBonusAttack) {
        this.spellBonusAttack = spellBonusAttack;
    }

    public List<CantripDTO> getCantrips() {
        return cantrips;
    }

    public void setCantrips(List<CantripDTO> cantrips) {
        this.cantrips = cantrips;
    }

    public List<SpellSlotsDTO> getSpellSlots() {
        return spellSlots;
    }

    public void setSpellSlots(List<SpellSlotsDTO> spellSlots) {
        this.spellSlots = spellSlots;
    }

    public List<SpellKnownDTO> getSpellsKnown() {
        return spellsKnown;
    }

    public void setSpellsKnown(List<SpellKnownDTO> spellsKnown) {
        this.spellsKnown = spellsKnown;
    }

    @Override
    public String toString() {
        return "SpellsDTO{" +
                "spellcastingClass='" + spellcastingClass + '\'' +
                ", spellcastingAbility='" + spellcastingAbility + '\'' +
                ", spellSaveDc=" + spellSaveDc +
                ", spellBonusAttack=" + spellBonusAttack +
                ", cantrips=" + cantrips +
                ", spellSlots=" + spellSlots +
                ", spellsKnown=" + spellsKnown +
                '}';
    }
}
