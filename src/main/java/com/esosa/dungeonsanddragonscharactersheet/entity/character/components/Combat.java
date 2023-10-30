package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.combat.AttacksAndSpellcasting;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.combat.DeathSaves;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "combat")
public class Combat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "armor_class")
    @Min(value = 0, message = "ArmorClass cannot be smaller than 0")
    @Max(value = 999, message = "ArmorClass cannot be bigger than 999")
    private int armorClass;

    @Column(name = "initiative")
    @Min(value = 0, message = "Initiative cannot be smaller than 0")
    @Max(value = 999, message = "Initiative cannot be bigger than 999")
    private int initiative;

    @Column(name = "speed")
    @Min(value = 0, message = "Speed cannot be smaller than 0")
    @Max(value = 999, message = "Speed cannot be bigger than 999")
    private int speed;

    @Column(name = "max_hitpoints")
    @Min(value = 0, message = "MaxHitpoints cannot be smaller than 0")
    @Max(value = 999, message = "MaxHitpoints cannot be bigger than 999")
    private int maxHitpoints;

    @Column(name = "current_hitpoints")
    @Min(value = 0, message = "CurrentHitpoints cannot be smaller than 0")
    @Max(value = 999, message = "CurrentHitpoints cannot be bigger than 999")
    private int currentHitpoints;

    @Column(name = "temporary_hitpoints")
    @Min(value = 0, message = "TemporaryHitpoints cannot be smaller than 0")
    @Max(value = 999, message = "TemporaryHitpoints cannot be bigger than 999")
    private int temporaryHitpoints;

    @Column(name = "hit_dice")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s.()?+-]+)$", message = "HitDice can only contain letters and numbers, spaces and ?+-")
    @Size(max = 12, message = "HitDice can be 12 character long max")
    private String hitDice;

    @Column(name = "hit_dice_total")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s.()?+-]+)$", message = "HitDiceTotal can only contain letters and numbers, spaces and ?+-")
    @Size(max = 12, message = "HitDiceTotal can be 12 character long max")
    private String hitDiceTotal;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "death_saves_id")
    private DeathSaves deathSaves;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "attacks_and_spellcasting_id")
    private AttacksAndSpellcasting attacksAndSpellcasting;

    public Combat() {
        this.deathSaves = new DeathSaves();
        this.attacksAndSpellcasting = new AttacksAndSpellcasting();
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
