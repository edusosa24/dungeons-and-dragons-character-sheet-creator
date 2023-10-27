package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "backstory")
public class Backstory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "backstory")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$", message = "Backstory can only contain letters, numbers, spaces and .,!?+-")
    private String backstory;

    @Column(name = "allies_and_organizations")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$", message = "AlliesAndOrganizations can only contain letters, numbers, spaces and .,!?+-")
    private String alliesAndOrganizations;

    @Column(name = "organization_name")
    @Size(max = 64, message = "Organization name cannot be longer than 64 characters")
    @Pattern(regexp = "^(|[a-zA-Z0-9\\s]+$)", message = "Organization name hair can only contain contain letters, numbers and spaces")
    private String organizationName;

    @Column(name = "organization_symbol")
    @Size(max = 255, message = "OrganizationSymbol path cannot be longer than 255 characters")
    @Pattern(regexp = "^(|([A-Za-z]:\\\\)?([\\\\w.-]+\\\\)*)$", message = "OrganizationSymbol path is invalid.")
    private String organizationSymbol;

    @Column(name = "additional_features_and_traits")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$", message = "AdditionalFeaturesAndTraits can only contain letters, numbers, spaces and .,!?+-")
    private String additionalFeaturesAndTraits;

    @Column(name = "other_proficiencies_and_languages")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$", message = "OtherProficienciesAndLanguages can only contain letters, numbers, spaces and .,!?+-")
    private String otherProficienciesAndLanguages;

    @Column(name = "treasure")
    @Pattern(regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$", message = "Treasure can only contain letters, numbers, spaces and .,!?+-")
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

