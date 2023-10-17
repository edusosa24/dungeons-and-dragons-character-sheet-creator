package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;

@Entity
@Table(name = "backstory")
public class Backstory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "backstory")
    private String backstory;

    @Column(name = "allies_and_organizations")
    private String alliesAndOrganizations;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "organization_symbol")
    private String organizationSymbol;

    @Column(name = "additional_features_and_traits")
    private String additionalFeaturesAndTraits;

    @Column(name = "other_proficiencies_and_languages")
    private String otherProficienciesAndLanguages;

    @Column(name = "treasure")
    private String treasure;

    public Backstory() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public String getAlliesAndOrganizations() {
        return alliesAndOrganizations;
    }

    public void setAlliesAndOrganizations(String alliesAndOrganizations) {
        this.alliesAndOrganizations = alliesAndOrganizations;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationSymbol() {
        return organizationSymbol;
    }

    public void setOrganizationSymbol(String organizationSymbol) {
        this.organizationSymbol = organizationSymbol;
    }

    public String getAdditionalFeaturesAndTraits() {
        return additionalFeaturesAndTraits;
    }

    public void setAdditionalFeaturesAndTraits(String additionalFeaturesAndTraits) {
        this.additionalFeaturesAndTraits = additionalFeaturesAndTraits;
    }

    public String getOtherProficienciesAndLanguages() {
        return otherProficienciesAndLanguages;
    }

    public void setOtherProficienciesAndLanguages(String otherProficienciesAndLanguages) {
        this.otherProficienciesAndLanguages = otherProficienciesAndLanguages;
    }

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    @Override
    public String toString() {
        return "Backstory{" +
                "backstory='" + backstory + '\'' +
                ", alliesAndOrganizations='" + alliesAndOrganizations + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", organizationSymbol='" + organizationSymbol + '\'' +
                ", additionalFeaturesAndTraits='" + additionalFeaturesAndTraits + '\'' +
                ", otherProficienciesAndLanguages='" + otherProficienciesAndLanguages + '\'' +
                ", treasure='" + treasure + '\'' +
                '}';
    }
}

