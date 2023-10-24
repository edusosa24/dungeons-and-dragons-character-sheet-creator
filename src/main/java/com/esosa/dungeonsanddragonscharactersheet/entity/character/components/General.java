package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "general")
public class General {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "class")
    @Size(max = 64, message = "Character name can be 64 characters long max")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]$", message = "Character name should only contain letters and numbers and spaces")
    private String characterClass;

    @Column(name = "level")
    @Min(value = 1, message = "Level cannot be smaller than 1")
    @Max(value = 20, message = "Level cannot be bigger than 20")
    private int level;

    @Column(name = "background")
    @Size(max = 64, message = "Character name can be 64 characters long max")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]$", message = "Character name should only contain letters and numbers and spaces")
    private String background;

    @Column(name = "player_name")
    @Size(max = 64, message = "Character name can be 64 characters long max")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]$", message = "Character name should only contain letters and numbers and spaces")
    private String playerName;

    @Column(name = "race")
    @Size(max = 64, message = "Character name can be 64 characters long max")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]$", message = "Character name should only contain letters and numbers and spaces")
    private String race;

    @Column(name = "alignment")
    @Size(max = 64, message = "Character name can be 64 characters long max")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]$", message = "Character name should only contain letters and numbers and spaces")
    private String alignment;

    @Column(name = "experience_points")
    @Min(value = 0, message = "ExperiencePoints cannot be smaller than 0")
    @Max(value = 355000, message = "ExperiencePoints cannot be bigger than 355000")
    private int experiencePoints;

    public General() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
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

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    @Override
    public String toString() {
        return "General{" +
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