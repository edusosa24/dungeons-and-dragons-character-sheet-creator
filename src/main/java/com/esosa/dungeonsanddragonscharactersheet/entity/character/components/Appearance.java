package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "appearance")
public class Appearance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "age")
    @Min(value = 0, message = "Character age cannot be smaller than 0")
    @Max(value = 9999, message = "Character age cannot be bigger than 9999")
    private int age;

    @Column(name = "height")
    @Min(value = 0, message = "Character height cannot be smaller than 0")
    @Max(value = 9999, message = "Character height cannot be bigger than 9999")
    private float height;

    @Column(name = "weight")
    @Min(value = 0, message = "Character weight cannot be smaller than 0")
    @Max(value = 9999, message = "Character weight cannot be bigger than 9999")
    private float weight;

    @Column(name = "eyes")
    @Size(max = 64, message = "Character eyes cannot be longer than 64 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]$", message = "Character eyes can only contain letters and spaces")
    private String eyes;

    @Column(name = "skin")
    @Size(max = 64, message = "Character skin cannot be longer than 64 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]$", message = "Character skin can only contain letters and spaces")
    private String skin;

    @Column(name = "hair")
    @Size(max = 64, message = "Character hair cannot be longer than 64 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]$", message = "Character hair can only contain letters and spaces")
    private String hair;

    @Column(name = "portrait")
    @Size(max = 255, message = "Character portrait path cannot be longer than 255 characters")
    @Pattern(regexp = "^([A-Za-z]:\\\\)?([\\\\w.-]+\\\\)*$", message = "Character portrait path is invalid.")
    private String portrait;

    public Appearance() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @Override
    public String toString() {
        return "Appearance{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", eyes='" + eyes + '\'' +
                ", skin='" + skin + '\'' +
                ", hair='" + hair + '\'' +
                ", portrait='" + portrait + '\'' +
                '}';
    }
}

