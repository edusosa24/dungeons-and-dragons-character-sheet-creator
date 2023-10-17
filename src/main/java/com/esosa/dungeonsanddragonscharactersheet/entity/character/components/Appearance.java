package com.esosa.dungeonsanddragonscharactersheet.entity.character.components;

import jakarta.persistence.*;

@Entity
@Table(name = "appearance")
public class Appearance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "age")
    private int age;

    @Column(name = "height")
    private float height;

    @Column(name = "weight")
    private float weight;

    @Column(name = "eyes")
    private String eyes;

    @Column(name = "skin")
    private String skin;

    @Column(name = "hair")
    private String hair;

    @Column(name = "portrait")
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

