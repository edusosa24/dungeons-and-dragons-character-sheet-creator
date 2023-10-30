package com.esosa.dungeonsanddragonscharactersheet.dto.character;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class GeneralDTO {

    @Size(message = "Character name can be 64 characters long max", max = 64)
    @Pattern(message = "Character name should only contain letters and numbers and spaces", regexp = "^(|[a-zA-Z0-9\\s]+)$")
    String characterClass;
    @Min(message = "Level cannot be smaller than 1", value = 1)
    @Max(message = "Level cannot be bigger than 20", value = 20)
    Integer level;
    @Size(message = "Character name can be 64 characters long max", max = 64)
    @Pattern(message = "Character name should only contain letters and numbers and spaces", regexp = "^(|[a-zA-Z0-9\\s]+)$")
    String background;
    @Size(message = "Character name can be 64 characters long max", max = 64)
    @Pattern(message = "Character name should only contain letters and numbers and spaces", regexp = "^(|[a-zA-Z0-9\\s]+)$")
    String playerName;
    @Size(message = "Character name can be 64 characters long max", max = 64)
    @Pattern(message = "Character name should only contain letters and numbers and spaces", regexp = "^(|[a-zA-Z0-9\\s]+)$")
    String race;
    @Size(message = "Character name can be 64 characters long max", max = 64)
    @Pattern(message = "Character name should only contain letters and numbers and spaces", regexp = "^(|[a-zA-Z0-9\\s]+)$")
    String alignment;
    @Min(message = "ExperiencePoints cannot be smaller than 0", value = 0)
    @Max(message = "ExperiencePoints cannot be bigger than 355000", value = 355000)
    Integer experiencePoints;

    public GeneralDTO() {
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Integer getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(Integer experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    @Override
    public String toString() {
        return "GeneralDTO{" +
                "characterClass='" + characterClass + '\'' +
                ", level=" + level +
                ", background='" + background + '\'' +
                ", playerName='" + playerName + '\'' +
                ", race='" + race + '\'' +
                ", alignment='" + alignment + '\'' +
                ", experiencePoints=" + experiencePoints +
                '}';
    }
}
