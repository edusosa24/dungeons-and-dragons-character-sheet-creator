package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.combat;

import jakarta.persistence.*;

@Entity
@Table(name = "weapon_aux")
public class WeaponAux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "attack_bonus")
    private String attackBonus;

    @Column(name = "damage_and_type")
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
