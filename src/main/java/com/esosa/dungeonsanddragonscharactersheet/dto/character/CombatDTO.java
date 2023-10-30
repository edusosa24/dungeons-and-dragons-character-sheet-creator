package com.esosa.dungeonsanddragonscharactersheet.dto.character;

import com.esosa.dungeonsanddragonscharactersheet.dto.character.combat.AttacksAndSpellcastingDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.character.combat.DeathSavesDTO;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CombatDTO {

    @Min(message = "ArmorClass cannot be smaller than 0", value = 0)
    @Max(message = "ArmorClass cannot be bigger than 999", value = 999)
    Integer armorClass;
    @Min(message = "Initiative cannot be smaller than 0", value = 0)
    @Max(message = "Initiative cannot be bigger than 999", value = 999)
    Integer initiative;
    @Min(message = "Speed cannot be smaller than 0", value = 0)
    @Max(message = "Speed cannot be bigger than 999", value = 999)
    Integer speed;
    @Min(message = "MaxHitpoints cannot be smaller than 0", value = 0)
    @Max(message = "MaxHitpoints cannot be bigger than 999", value = 999)
    Integer maxHitpoints;
    @Min(message = "CurrentHitpoints cannot be smaller than 0", value = 0)
    @Max(message = "CurrentHitpoints cannot be bigger than 999", value = 999)
    Integer currentHitpoints;
    @Min(message = "TemporaryHitpoints cannot be smaller than 0", value = 0)
    @Max(message = "TemporaryHitpoints cannot be bigger than 999", value = 999)
    Integer temporaryHitpoints;
    @Size(message = "HitDice can be 12 character long max", max = 12)
    @Pattern(message = "HitDice can only contain letters and numbers, spaces and ?+-", regexp = "^(|[A-Za-z0-9\\s.()?+-]+)$")
    String hitDice;
    @Size(message = "HitDiceTotal can be 12 character long max", max = 12)
    @Pattern(message = "HitDiceTotal can only contain letters and numbers, spaces and ?+-", regexp = "^(|[A-Za-z0-9\\s.()?+-]+)$")
    String hitDiceTotal;
    DeathSavesDTO deathSaves;
    AttacksAndSpellcastingDTO attacksAndSpellcasting;

    public CombatDTO() {
    }

    public Integer getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(Integer armorClass) {
        this.armorClass = armorClass;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getMaxHitpoints() {
        return maxHitpoints;
    }

    public void setMaxHitpoints(Integer maxHitpoints) {
        this.maxHitpoints = maxHitpoints;
    }

    public Integer getCurrentHitpoints() {
        return currentHitpoints;
    }

    public void setCurrentHitpoints(Integer currentHitpoints) {
        this.currentHitpoints = currentHitpoints;
    }

    public Integer getTemporaryHitpoints() {
        return temporaryHitpoints;
    }

    public void setTemporaryHitpoints(Integer temporaryHitpoints) {
        this.temporaryHitpoints = temporaryHitpoints;
    }

    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    public String getHitDiceTotal() {
        return hitDiceTotal;
    }

    public void setHitDiceTotal(String hitDiceTotal) {
        this.hitDiceTotal = hitDiceTotal;
    }

    public DeathSavesDTO getDeathSaves() {
        return deathSaves;
    }

    public void setDeathSaves(DeathSavesDTO deathSaves) {
        this.deathSaves = deathSaves;
    }

    public AttacksAndSpellcastingDTO getAttacksAndSpellcasting() {
        return attacksAndSpellcasting;
    }

    public void setAttacksAndSpellcasting(AttacksAndSpellcastingDTO attacksAndSpellcasting) {
        this.attacksAndSpellcasting = attacksAndSpellcasting;
    }

    @Override
    public String toString() {
        return "CombatDTO{" +
                "armorClass=" + armorClass +
                ", initiative=" + initiative +
                ", speed=" + speed +
                ", maxHitpoints=" + maxHitpoints +
                ", currentHitpoints=" + currentHitpoints +
                ", temporaryHitpoints=" + temporaryHitpoints +
                ", hitDice='" + hitDice + '\'' +
                ", hitDiceTotal='" + hitDiceTotal + '\'' +
                ", deathSaves=" + deathSaves +
                ", attacksAndSpellcasting=" + attacksAndSpellcasting +
                '}';
    }
}
