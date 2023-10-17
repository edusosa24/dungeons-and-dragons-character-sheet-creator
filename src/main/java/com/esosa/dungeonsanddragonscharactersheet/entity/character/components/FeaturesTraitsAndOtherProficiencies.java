package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;

@Entity
@Table(name = "features_traits_and_other_proficiencies")
public class FeaturesTraitsAndOtherProficiencies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "personality_traits")
    private String personalityTraits;

    @Column(name = "ideals")
    private String ideals;

    @Column(name = "bonds")
    private String bonds;

    @Column(name = "flaws")
    private String flaws;

    @Column(name = "features_and_traits")
    private String featuresAndTraits;

    @Column(name = "other_proficiencies_and_languages")
    private String otherProficienciesAndLanguages;

    public FeaturesTraitsAndOtherProficiencies() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }

    public String getFeaturesAndTraits() {
        return featuresAndTraits;
    }

    public void setFeaturesAndTraits(String featuresAndTraits) {
        this.featuresAndTraits = featuresAndTraits;
    }

    public String getOtherProficienciesAndLanguages() {
        return otherProficienciesAndLanguages;
    }

    public void setOtherProficienciesAndLanguages(String otherProficienciesAndLanguages) {
        this.otherProficienciesAndLanguages = otherProficienciesAndLanguages;
    }

    @Override
    public String toString() {
        return "FeaturesTraitsAndOtherProficiencies{" +
                "personalityTraits='" + personalityTraits + '\'' +
                ", ideals='" + ideals + '\'' +
                ", bonds='" + bonds + '\'' +
                ", flaws='" + flaws + '\'' +
                ", featuresAndTraits='" + featuresAndTraits + '\'' +
                ", otherProficienciesAndLanguages='" + otherProficienciesAndLanguages + '\'' +
                '}';
    }
}

