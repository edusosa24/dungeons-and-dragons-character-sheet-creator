package com.esosa.dungeonsanddragonscharactersheet.dto.character.combat;

import jakarta.validation.constraints.Pattern;

public class AttacksAndSpellcastingDTO {

    WeaponAuxDTO weaponOne;
    WeaponAuxDTO weaponTwo;
    WeaponAuxDTO weaponThree;
    @Pattern(message = "AttackAndSpellcasting extra can only contain letters and numbers, spaces and .()?+-", regexp = "^(|[A-Za-z0-9\\s\\n.()?+-]+)$")
    String extra;

    public AttacksAndSpellcastingDTO() {
    }

    public WeaponAuxDTO getWeaponOne() {
        return weaponOne;
    }

    public void setWeaponOne(WeaponAuxDTO weaponOne) {
        this.weaponOne = weaponOne;
    }

    public WeaponAuxDTO getWeaponTwo() {
        return weaponTwo;
    }

    public void setWeaponTwo(WeaponAuxDTO weaponTwo) {
        this.weaponTwo = weaponTwo;
    }

    public WeaponAuxDTO getWeaponThree() {
        return weaponThree;
    }

    public void setWeaponThree(WeaponAuxDTO weaponThree) {
        this.weaponThree = weaponThree;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "AttacksAndSpellcastingDTO{" +
                "weaponOne=" + weaponOne +
                ", weaponTwo=" + weaponTwo +
                ", weaponThree=" + weaponThree +
                ", extra='" + extra + '\'' +
                '}';
    }
}
