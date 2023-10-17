package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;

@Entity
@Table(name = "general")
public class General {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "class")
    private String characterClass;

    @Column(name = "level")
    private int level;

    @Column(name = "background")
    private String background;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "race")
    private String race;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "experience_points")
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