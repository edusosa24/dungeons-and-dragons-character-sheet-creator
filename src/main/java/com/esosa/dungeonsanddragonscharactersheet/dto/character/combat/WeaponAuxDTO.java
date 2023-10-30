package com.esosa.dungeonsanddragonscharactersheet.dto.character.combat;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class WeaponAuxDTO {

    @Size(message = "Weapon name can be 32 character long max", max = 32)
    @Pattern(message = "Weapon name can only contain letters and numbers, spaces and ?", regexp = "^(|[A-Za-z0-9\\s?]+)$")
    String name;
    @Size(message = "Weapon attackBonus can be 16 character long max", max = 16)
    @Pattern(message = "Weapon attackBonus can only contain letters and numbers, spaces and ?+-", regexp = "^(|[A-Za-z0-9\\s?+-]+)$")
    String attackBonus;
    @Size(message = "Weapon damageAndType can be 32 character long max", max = 32)
    @Pattern(message = "Weapon damageAndType can only contain letters and numbers, spaces and ?+-", regexp = "^(|[A-Za-z0-9\\s?+-]+)$")
    String damageAndType;

    public WeaponAuxDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(String attackBonus) {
        this.attackBonus = attackBonus;
    }

    public String getDamageAndType() {
        return damageAndType;
    }

    public void setDamageAndType(String damageAndType) {
        this.damageAndType = damageAndType;
    }

    @Override
    public String toString() {
        return "WeaponAuxDTO{" +
                "name='" + name + '\'' +
                ", attackBonus='" + attackBonus + '\'' +
                ", damageAndType='" + damageAndType + '\'' +
                '}';
    }
}
