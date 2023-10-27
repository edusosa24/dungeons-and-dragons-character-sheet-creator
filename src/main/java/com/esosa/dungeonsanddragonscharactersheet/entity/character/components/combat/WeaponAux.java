package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.combat;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "weapon_aux")
public class WeaponAux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s?]+)$", message = "Weapon name can only contain letters and numbers, spaces and ?")
    @Size(max = 32, message = "Weapon name can be 32 character long max")
    private String name;

    @Column(name = "attack_bonus")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s?+-]+)$", message = "Weapon attackBonus can only contain letters and numbers, spaces and ?+-")
    @Size(max = 16, message = "Weapon attackBonus can be 16 character long max")
    private String attackBonus;

    @Column(name = "damage_and_type")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s?+-]+)$", message = "Weapon damageAndType can only contain letters and numbers, spaces and ?+-")
    @Size(max = 32, message = "Weapon damageAndType can be 32 character long max")
    private String damageAndType;

    public WeaponAux() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "WeaponAux{" +
                "name='" + name + '\'' +
                ", attackBonus='" + attackBonus + '\'' +
                ", damageAndType='" + damageAndType + '\'' +
                '}';
    }
}
