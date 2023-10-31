package com.esosa.dungeonsanddragonscharactersheet.dto;

public class ShortCharacterDTO {
    private long id;
    private String name;
    private String characterClass;
    private String race;
    private int level;

    public ShortCharacterDTO() {
    }

    public ShortCharacterDTO(long id, String name, String characterClass, String race, int level) {
        this.id = id;
        this.name = name;
        this.characterClass = characterClass;
        this.race = race;
        this.level = level;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
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
                ", name='" + name + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", race='" + race + '\'' +
                ", level=" + level +
                '}';
    }
}
