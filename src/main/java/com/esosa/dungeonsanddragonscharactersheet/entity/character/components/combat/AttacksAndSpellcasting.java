package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.combat;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "attacks_and_spellcasting")
public class AttacksAndSpellcasting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "weapon_one")
    private WeaponAux weaponOne;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "weapon_two")
    private WeaponAux weaponTwo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "weapon_three")
    private WeaponAux weaponThree;

    @Column(name = "extra")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s\\n.()?+-]+)$", message = "AttackAndSpellcasting extra can only contain letters and numbers, spaces and .()?+-")
    private String extra;

    public AttacksAndSpellcasting() {
        this.weaponOne = new WeaponAux();
        this.weaponTwo = new WeaponAux();
        this.weaponThree = new WeaponAux();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public WeaponAux getWeaponOne() {
        return weaponOne;
    }

    public void setWeaponOne(WeaponAux weaponOne) {
        this.weaponOne = weaponOne;
    }

    public WeaponAux getWeaponTwo() {
        return weaponTwo;
    }

    public void setWeaponTwo(WeaponAux weaponTwo) {
        this.weaponTwo = weaponTwo;
    }

    public WeaponAux getWeaponThree() {
        return weaponThree;
    }

    public void setWeaponThree(WeaponAux weaponThree) {
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
        return "AttacksAndSpellcasting{" +
                "weaponOne=" + weaponOne +
                ", weaponTwo=" + weaponTwo +
                ", weaponThree=" + weaponThree +
                ", extra='" + extra + '\'' +
                '}';
    }
}
