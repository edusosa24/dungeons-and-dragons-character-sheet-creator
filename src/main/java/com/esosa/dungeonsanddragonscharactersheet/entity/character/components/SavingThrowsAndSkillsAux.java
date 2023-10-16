package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;

@Entity
@Table(name = "saving_throws_and_skills_aux")
public class SavingThrowsAndSkillsAux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "proficiency")
    private boolean proficiency;

    @Column(name = "bonus")
    private int bonus;

    public SavingThrowsAndSkillsAux() {
    }

    public SavingThrowsAndSkillsAux(boolean proficiency, int bonus) {
        this.proficiency = proficiency;
        this.bonus = bonus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isProficiency() {
        return proficiency;
    }

    public void setProficiency(boolean proficiency) {
        this.proficiency = proficiency;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "SavingThrowsAndSkillsAux{" +
                "proficiency=" + proficiency +
                ", bonus=" + bonus +
                '}';
    }
}
