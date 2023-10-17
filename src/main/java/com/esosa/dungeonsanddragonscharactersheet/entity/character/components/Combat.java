package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.combat.AttacksAndSpellcasting;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.combat.DeathSaves;
import jakarta.persistence.*;

@Entity
@Table(name = "combat")
public class Combat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "armor_class")
    private int armorClass;

    @Column(name = "initiative")
    private int initiative;

    @Column(name = "speed")
    private int speed;

    @Column(name = "max_hitpoints")
    private int maxHitpoints;

    @Column(name = "current_hitpoints")
    private int currentHitpoints;

    @Column(name = "temporary_hitpoints")
    private int temporaryHitpoints;

    @Column(name = "hit_dice")
    private String hitDice;

    @Column(name = "hit_dice_total")
    private String hitDiceTotal;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "combat_id")
    private DeathSaves deathSaves;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "combat_id")
    private AttacksAndSpellcasting attacksAndSpellcasting;

    public Combat() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxHitpoints() {
        return maxHitpoints;
    }

    public void setMaxHitpoints(int maxHitpoints) {
        this.maxHitpoints = maxHitpoints;
    }

    public int getCurrentHitpoints() {
        return currentHitpoints;
    }

    public void setCurrentHitpoints(int currentHitpoints) {
        this.currentHitpoints = currentHitpoints;
    }

    public int getTemporaryHitpoints() {
        return temporaryHitpoints;
    }

    public void setTemporaryHitpoints(int temporaryHitpoints) {
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

    public DeathSaves getDeathSaves() {
        return deathSaves;
    }

    public void setDeathSaves(DeathSaves deathSaves) {
        this.deathSaves = deathSaves;
    }

    public AttacksAndSpellcasting getAttacksAndSpellcasting() {
        return attacksAndSpellcasting;
    }

    public void setAttacksAndSpellcasting(AttacksAndSpellcasting attacksAndSpellcasting) {
        this.attacksAndSpellcasting = attacksAndSpellcasting;
    }

    @Override
    public String toString() {
        return "Combat{" +
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
