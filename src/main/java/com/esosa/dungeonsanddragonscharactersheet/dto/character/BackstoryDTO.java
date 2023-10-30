package com.esosa.dungeonsanddragonscharactersheet.dto.character;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class BackstoryDTO {

    @Pattern(message = "Backstory can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$")
    String backstory;
    @Pattern(message = "AlliesAndOrganizations can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$")
    String alliesAndOrganizations;
    @Size(message = "Organization name cannot be longer than 64 characters", max = 64)
    @Pattern(message = "Organization name hair can only contain contain letters, numbers and spaces", regexp = "^(|[a-zA-Z0-9\\s]+$)")
    String organizationName;
    @Size(message = "OrganizationSymbol path cannot be longer than 255 characters", max = 255)
    @Pattern(message = "OrganizationSymbol path is invalid.", regexp = "^(|([A-Za-z]:\\\\)?([\\\\w.-]+\\\\)*)$")
    String organizationSymbol;
    @Pattern(message = "AdditionalFeaturesAndTraits can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$")
    String additionalFeaturesAndTraits;
    @Pattern(message = "OtherProficienciesAndLanguages can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$")
    String otherProficienciesAndLanguages;
    @Pattern(message = "Treasure can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$")
    String treasure;

    public BackstoryDTO() {
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
        return "BackstoryDTO{" +
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
