package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.abilityscore;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "acrobatics")
    private SavingThrowsAndSkillsAux acrobatics;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "animal_handling")
    private SavingThrowsAndSkillsAux animalHandling;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "arcana")
    private SavingThrowsAndSkillsAux arcana;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "athletics")
    private SavingThrowsAndSkillsAux athletics;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "deception")
    private SavingThrowsAndSkillsAux deception;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "history")
    private SavingThrowsAndSkillsAux history;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "insight")
    private SavingThrowsAndSkillsAux insight;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "intimidation")
    private SavingThrowsAndSkillsAux intimidation;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "investigation")
    private SavingThrowsAndSkillsAux investigation;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "medicine")
    private SavingThrowsAndSkillsAux medicine;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "nature")
    private SavingThrowsAndSkillsAux nature;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "perception")
    private SavingThrowsAndSkillsAux perception;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "performance")
    private SavingThrowsAndSkillsAux performance;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "persuasion")
    private SavingThrowsAndSkillsAux persuasion;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "religion")
    private SavingThrowsAndSkillsAux religion;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "sleight_of_hand")
    private SavingThrowsAndSkillsAux sleightOfHand;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "stealth")
    private SavingThrowsAndSkillsAux stealth;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "survival")
    private SavingThrowsAndSkillsAux survival;

    public Skills() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SavingThrowsAndSkillsAux getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(SavingThrowsAndSkillsAux acrobatics) {
        this.acrobatics = acrobatics;
    }

    public SavingThrowsAndSkillsAux getAnimalHandling() {
        return animalHandling;
    }

    public void setAnimalHandling(SavingThrowsAndSkillsAux animalHandling) {
        this.animalHandling = animalHandling;
    }

    public SavingThrowsAndSkillsAux getArcana() {
        return arcana;
    }

    public void setArcana(SavingThrowsAndSkillsAux arcana) {
        this.arcana = arcana;
    }

    public SavingThrowsAndSkillsAux getAthletics() {
        return athletics;
    }

    public void setAthletics(SavingThrowsAndSkillsAux athletics) {
        this.athletics = athletics;
    }

    public SavingThrowsAndSkillsAux getDeception() {
        return deception;
    }

    public void setDeception(SavingThrowsAndSkillsAux deception) {
        this.deception = deception;
    }

    public SavingThrowsAndSkillsAux getHistory() {
        return history;
    }

    public void setHistory(SavingThrowsAndSkillsAux history) {
        this.history = history;
    }

    public SavingThrowsAndSkillsAux getInsight() {
        return insight;
    }

    public void setInsight(SavingThrowsAndSkillsAux insight) {
        this.insight = insight;
    }

    public SavingThrowsAndSkillsAux getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(SavingThrowsAndSkillsAux intimidation) {
        this.intimidation = intimidation;
    }

    public SavingThrowsAndSkillsAux getInvestigation() {
        return investigation;
    }

    public void setInvestigation(SavingThrowsAndSkillsAux investigation) {
        this.investigation = investigation;
    }

    public SavingThrowsAndSkillsAux getMedicine() {
        return medicine;
    }

    public void setMedicine(SavingThrowsAndSkillsAux medicine) {
        this.medicine = medicine;
    }

    public SavingThrowsAndSkillsAux getNature() {
        return nature;
    }

    public void setNature(SavingThrowsAndSkillsAux nature) {
        this.nature = nature;
    }

    public SavingThrowsAndSkillsAux getPerception() {
        return perception;
    }

    public void setPerception(SavingThrowsAndSkillsAux perception) {
        this.perception = perception;
    }

    public SavingThrowsAndSkillsAux getPerformance() {
        return performance;
    }

    public void setPerformance(SavingThrowsAndSkillsAux performance) {
        this.performance = performance;
    }

    public SavingThrowsAndSkillsAux getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(SavingThrowsAndSkillsAux persuasion) {
        this.persuasion = persuasion;
    }

    public SavingThrowsAndSkillsAux getReligion() {
        return religion;
    }

    public void setReligion(SavingThrowsAndSkillsAux religion) {
        this.religion = religion;
    }

    public SavingThrowsAndSkillsAux getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(SavingThrowsAndSkillsAux sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public SavingThrowsAndSkillsAux getStealth() {
        return stealth;
    }

    public void setStealth(SavingThrowsAndSkillsAux stealth) {
        this.stealth = stealth;
    }

    public SavingThrowsAndSkillsAux getSurvival() {
        return survival;
    }

    public void setSurvival(SavingThrowsAndSkillsAux survival) {
        this.survival = survival;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "acrobatics=" + acrobatics +
                ", animalHandling=" + animalHandling +
                ", arcana=" + arcana +
                ", athletics=" + athletics +
                ", deception=" + deception +
                ", history=" + history +
                ", insight=" + insight +
                ", intimidation=" + intimidation +
                ", investigation=" + investigation +
                ", medicine=" + medicine +
                ", nature=" + nature +
                ", perception=" + perception +
                ", performance=" + performance +
                ", persuasion=" + persuasion +
                ", religion=" + religion +
                ", sleightOfHand=" + sleightOfHand +
                ", stealth=" + stealth +
                ", survival=" + survival +
                '}';
    }
}
