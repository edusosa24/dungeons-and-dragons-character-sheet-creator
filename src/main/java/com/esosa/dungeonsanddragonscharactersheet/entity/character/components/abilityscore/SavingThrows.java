package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.abilityscore;

import jakarta.persistence.*;

@Entity
@Table(name = "saving_throws")
public class SavingThrows {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "strength")
    private SavingThrowsAndSkillsAux strength;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "dexterity")
    private SavingThrowsAndSkillsAux dexterity;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "constitution")
    private SavingThrowsAndSkillsAux constitution;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "intelligence")
    private SavingThrowsAndSkillsAux intelligence;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "wisdom")
    private SavingThrowsAndSkillsAux wisdom;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "charisma")
    private SavingThrowsAndSkillsAux charisma;

    public SavingThrows() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SavingThrowsAndSkillsAux getStrength() {
        return strength;
    }

    public void setStrength(SavingThrowsAndSkillsAux strength) {
        this.strength = strength;
    }

    public SavingThrowsAndSkillsAux getDexterity() {
        return dexterity;
    }

    public void setDexterity(SavingThrowsAndSkillsAux dexterity) {
        this.dexterity = dexterity;
    }

    public SavingThrowsAndSkillsAux getConstitution() {
        return constitution;
    }

    public void setConstitution(SavingThrowsAndSkillsAux constitution) {
        this.constitution = constitution;
    }

    public SavingThrowsAndSkillsAux getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(SavingThrowsAndSkillsAux intelligence) {
        this.intelligence = intelligence;
    }

    public SavingThrowsAndSkillsAux getWisdom() {
        return wisdom;
    }

    public void setWisdom(SavingThrowsAndSkillsAux wisdom) {
        this.wisdom = wisdom;
    }

    public SavingThrowsAndSkillsAux getCharisma() {
        return charisma;
    }

    public void setCharisma(SavingThrowsAndSkillsAux charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return "SavingThrows{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }
}
