package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.abilityscore.SavingThrows;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.abilityscore.Skills;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.abilityscore.Stats;
import jakarta.persistence.*;

@Entity
@Table(name = "ability_score")
public class AbilityScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "inspiration")
    private int inspiration;

    @Column(name = "proficiency_bonus")
    private int proficiencyBonus;

    @Column(name = "passive_wisdom")
    private int passiveWisdom;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "ability_score_id")
    private Stats stats;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "ability_score_id")
    private Skills skills;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "ability_score_id")
    private SavingThrows savingThrows;

    public AbilityScore() {
    }

    public AbilityScore(int inspiration, int proficiencyBonus, int passiveWisdom) {
        this.inspiration = inspiration;
        this.proficiencyBonus = proficiencyBonus;
        this.passiveWisdom = passiveWisdom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getInspiration() {
        return inspiration;
    }

    public void setInspiration(int inspiration) {
        this.inspiration = inspiration;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public int getPassiveWisdom() {
        return passiveWisdom;
    }

    public void setPassiveWisdom(int passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public SavingThrows getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(SavingThrows savingThrows) {
        this.savingThrows = savingThrows;
    }

    @Override
    public String toString() {
        return "AbilityScore{" +
                "inspiration=" + inspiration +
                ", proficiencyBonus=" + proficiencyBonus +
                ", passiveWisdom=" + passiveWisdom +
                ", stats=" + stats +
                ", skills=" + skills +
                ", savingThrows=" + savingThrows +
                '}';
    }
}
