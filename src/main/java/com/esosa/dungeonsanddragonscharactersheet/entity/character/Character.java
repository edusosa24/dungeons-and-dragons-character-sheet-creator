package com.esosa.dungeonsanddragonscharactersheet.entity.character;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.*;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "character")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "last_modified")
    private Timestamp lastModified;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "character_id")
    private AbilityScore abilityScore;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "character_id")
    private Combat combat;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "character_id")
    private Spells spells;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "character_id")
    private General general;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "character_id")
    private EquipmentAndMoney equipmentAndMoney;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "character_id")
    private Appearance appearance;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "character_id")
    private Backstory backstory;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "character_id")
    private FeaturesTraitsAndOtherProficiencies featuresTraitsAndOtherProficiencies;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
        this.lastModified = new Timestamp(System.currentTimeMillis());
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }

    public void updateLastModified() {
        this.lastModified = new Timestamp(System.currentTimeMillis());
    }

    public AbilityScore getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(AbilityScore abilityScore) {
        this.abilityScore = abilityScore;
    }

    public Combat getCombat() {
        return combat;
    }

    public void setCombat(Combat combat) {
        this.combat = combat;
    }

    public Spells getSpells() {
        return spells;
    }

    public void setSpells(Spells spells) {
        this.spells = spells;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    public EquipmentAndMoney getEquipmentAndMoney() {
        return equipmentAndMoney;
    }

    public void setEquipmentAndMoney(EquipmentAndMoney equipmentAndMoney) {
        this.equipmentAndMoney = equipmentAndMoney;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Backstory getBackstory() {
        return backstory;
    }

    public void setBackstory(Backstory backstory) {
        this.backstory = backstory;
    }

    public FeaturesTraitsAndOtherProficiencies getFeaturesTraitsAndOtherProficiencies() {
        return featuresTraitsAndOtherProficiencies;
    }

    public void setFeaturesTraitsAndOtherProficiencies(FeaturesTraitsAndOtherProficiencies featuresTraitsAndOtherProficiencies) {
        this.featuresTraitsAndOtherProficiencies = featuresTraitsAndOtherProficiencies;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastModified=" + lastModified +
                ", abilityScore=" + abilityScore +
                ", combat=" + combat +
                ", spells=" + spells +
                ", general=" + general +
                ", equipmentAndMoney=" + equipmentAndMoney +
                ", appearance=" + appearance +
                ", backstory=" + backstory +
                ", featuresTraitsAndOtherProficiencies=" + featuresTraitsAndOtherProficiencies +
                '}';
    }
}