package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells.Cantrip;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells.SpellKnown;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.spells.SpellSlots;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "spells")
public class Spells {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "spellcasting_class")
    private String spellcastingClass;

    @Column(name = "spellcasting_ability")
    private String spellcastingAbility;

    @Column(name = "spell_save_dc")
    private int spellSaveDc;

    @Column(name = "spell_bonus_attack")
    private int spellBonusAttack;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "spells_id")
    private List<Cantrip> cantrips;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "spells_id")
    private List<SpellSlots> spellSlots;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "spells_id")
    private List<SpellKnown> spellsKnown;

    public Spells() {
        cantrips = new ArrayList<>();
        spellSlots = new ArrayList<>();
        spellsKnown = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getSpellSaveDc() {
        return spellSaveDc;
    }

    public void setSpellSaveDc(int spellSaveDc) {
        this.spellSaveDc = spellSaveDc;
    }

    public int getSpellBonusAttack() {
        return spellBonusAttack;
    }

    public void setSpellBonusAttack(int spellBonusAttack) {
        this.spellBonusAttack = spellBonusAttack;
    }

    public List<Cantrip> getCantrips() {
        return cantrips;
    }

    public void setCantrips(List<Cantrip> cantrips) {
        this.cantrips = cantrips;
    }

    public List<SpellSlots> getSpellSlots() {
        return spellSlots;
    }

    public void setSpellSlots(List<SpellSlots> spellSlots) {
        this.spellSlots = spellSlots;
    }

    public List<SpellKnown> getSpellsKnown() {
        return spellsKnown;
    }

    public void setSpellsKnown(List<SpellKnown> spellsKnown) {
        this.spellsKnown = spellsKnown;
    }

    public void addCantrip(Cantrip newCantrip){
        cantrips.add(newCantrip);
    }

    public void addSpellSlots(SpellSlots newSpellSlots) {
        spellSlots.add(newSpellSlots);
    }

    public void addSpellKnown(SpellKnown newSpellKnown) {
        spellsKnown.add(newSpellKnown);
    }

    @Override
    public String toString() {
        return "Spells{" +
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
