package com.esosa.dungeonsanddragonscharactersheet.dto;

public class ShortCharacterDTO {
    private long id;
    private String characterName;
    private String characterClass;
    private String characterRace;
    private int level;

    public ShortCharacterDTO(long id, String characterName, String characterClass, String characterRace, int level) {
        this.id = id;
        this.characterName = characterName;
        this.characterClass = characterClass;
        this.characterRace = characterRace;
        this.level = level;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(String characterRace) {
        this.characterRace = characterRace;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ShortCharacterDTO{" +
                "id=" + id +
                ", characterName='" + characterName + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", characterRace='" + characterRace + '\'' +
                ", level=" + level +
                '}';
    }
}
