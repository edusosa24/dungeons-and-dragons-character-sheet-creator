package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.abilityscore;

import jakarta.persistence.*;

@Entity
@Table(name = "stats")
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "strength")
    private StatsAux strength;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "dexterity")
    private StatsAux dexterity;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "constitution")
    private StatsAux constitution;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "intelligence")
    private StatsAux intelligence;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "wisdom")
    private StatsAux wisdom;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "charisma")
    private StatsAux charisma;

    public Stats() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StatsAux getStrength() {
        return strength;
    }

    public void setStrength(StatsAux strength) {
        this.strength = strength;
    }

    public StatsAux getDexterity() {
        return dexterity;
    }

    public void setDexterity(StatsAux dexterity) {
        this.dexterity = dexterity;
    }

    public StatsAux getConstitution() {
        return constitution;
    }

    public void setConstitution(StatsAux constitution) {
        this.constitution = constitution;
    }

    public StatsAux getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(StatsAux intelligence) {
        this.intelligence = intelligence;
    }

    public StatsAux getWisdom() {
        return wisdom;
    }

    public void setWisdom(StatsAux wisdom) {
        this.wisdom = wisdom;
    }

    public StatsAux getCharisma() {
        return charisma;
    }

    public void setCharisma(StatsAux charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }
}
