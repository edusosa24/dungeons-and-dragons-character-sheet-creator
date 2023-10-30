package com.esosa.dungeonsanddragonscharactersheet.dto.character;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class FeaturesTraitsAndOtherProficienciesDTO {

    @Size(message = "PersonalityTraits cannot be longer than 255 characters", max = 255)
    @Pattern(message = "PersonalityTraits can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+)$")
    String personalityTraits;
    @Size(message = "Ideals cannot be longer than 255 characters", max = 255)
    @Pattern(message = "Ideals can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+$)")
    String ideals;
    @Size(message = "Bonds cannot be longer than 255 characters", max = 255)
    @Pattern(message = "Bonds can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+$)")
    String bonds;
    @Size(message = "Flaws cannot be longer than 255 characters", max = 255)
    @Pattern(message = "Flaws can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+$)")
    String flaws;
    @Pattern(message = "FeaturesAndTraits can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+$)")
    String featuresAndTraits;
    @Pattern(message = "OtherProficienciesAndLanguages can only contain letters, numbers, spaces and .,!?+-", regexp = "^(|[A-Za-z0-9\\s\\n.,!?+-]+$)")
    String otherProficienciesAndLanguages;

    public FeaturesTraitsAndOtherProficienciesDTO() {
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
        return "FeaturesTraitsAndOtherProficienciesDTO{" +
                "personalityTraits='" + personalityTraits + '\'' +
                ", ideals='" + ideals + '\'' +
                ", bonds='" + bonds + '\'' +
                ", flaws='" + flaws + '\'' +
                ", featuresAndTraits='" + featuresAndTraits + '\'' +
                ", otherProficienciesAndLanguages='" + otherProficienciesAndLanguages + '\'' +
                '}';
    }
}
