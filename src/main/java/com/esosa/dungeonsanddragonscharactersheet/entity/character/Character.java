package com.esosa.dungeonsanddragonscharactersheet.entity.character;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.*;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name = "[character]")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @NotNull
    @Size(max = 64, message = "Character name can be 64 characters long max")
    @Pattern(regexp = "^(|[a-zA-Z0-9\\s]+)$", message = "Character name should only contain letters and numbers and spaces")
    private String name;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @Column(name = "last_modified")
    private Timestamp lastModified;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ability_score_id")
    private AbilityScore abilityScore;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "combat_id")
    private Combat combat;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "spells_id")
    private Spells spells;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "general_id")
    private General general;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "equipment_and_money_id")
    private EquipmentAndMoney equipmentAndMoney;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "appearance_id")
    private Appearance appearance;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "backstory_id")
    private Backstory backstory;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "features_traits_and_other_proficiencies_id")
    private FeaturesTraitsAndOtherProficiencies featuresTraitsAndOtherProficiencies;

    public Character() {
    }

    public Character(String name, User user) {
        this.name = name;
        this.user = user;
        this.lastModified = new Timestamp(System.currentTimeMillis());
        this.abilityScore = new AbilityScore();
        this.combat = new Combat();
        this.spells = new Spells();
        this.equipmentAndMoney = new EquipmentAndMoney();
        this.general = new General();
        this.appearance = new Appearance();
        this.backstory = new Backstory();
        this.featuresTraitsAndOtherProficiencies = new FeaturesTraitsAndOtherProficiencies();
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
                ", userId=" + user.getId() + '\'' +
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