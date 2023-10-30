package com.esosa.dungeonsanddragonscharactersheet.dto.character;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class AppearanceDTO {

    @Min(message = "Character age cannot be smaller than 0", value = 0)
    @Max(message = "Character age cannot be bigger than 9999", value = 9999)
    Integer age;
    Float height;
    Float weight;
    @Size(message = "Character eyes cannot be longer than 64 characters", max = 64)
    @Pattern(message = "Character eyes can only contain letters and spaces", regexp = "^(|[a-zA-Z\\s]+)$")
    String eyes;
    @Size(message = "Character skin cannot be longer than 64 characters", max = 64)
    @Pattern(message = "Character skin can only contain letters and spaces", regexp = "^(|[a-zA-Z\\s]+)$")
    String skin;
    @Size(message = "Character hair cannot be longer than 64 characters", max = 64)
    @Pattern(message = "Character hair can only contain letters and spaces", regexp = "^(|[a-zA-Z\\s]+)$")
    String hair;
    @Size(message = "Character portrait path cannot be longer than 255 characters", max = 255)
    @Pattern(message = "Character portrait path is invalid.", regexp = "^(|([A-Za-z]:\\\\)?([\\\\w.-]+\\\\)*)$")
    String portrait;

    public AppearanceDTO() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
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
        return "AppearanceDTO{" +
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
