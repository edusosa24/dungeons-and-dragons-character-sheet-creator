package com.esosa.dungeonsanddragonscharactersheet.controller;

import com.esosa.dungeonsanddragonscharactersheet.dao.AppDAO;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.*;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/character")
public class CharacterRestController {

    private AppDAO appDAO;

    @Autowired
    public CharacterRestController(AppDAO appDAO) {
        this.appDAO = appDAO;
    }

    @GetMapping("/test")
    public ResponseEntity<Map<String, Object>> getCharacterTest(){
        try {
            Character tempCharacter = new Character("John");
            AbilityScore tempAbilityScore = new AbilityScore(10, 10, 15);

            Stats tempStats = new Stats();
            tempStats.setStrength(new StatsAux(15, 2));
            tempStats.setDexterity(new StatsAux(15, 2));
            tempStats.setConstitution(new StatsAux(15, 2));
            tempStats.setIntelligence(new StatsAux(15, 2));
            tempStats.setWisdom(new StatsAux(15, 2));
            tempStats.setCharisma(new StatsAux(15, 2));


            Skills tempSkills = new Skills();
            tempSkills.setArcana(new SavingThrowsAndSkillsAux(true, 5));


            SavingThrows tempSavingThrows = new SavingThrows();

            tempAbilityScore.setStats(tempStats);
            tempAbilityScore.setSkills(tempSkills);
            tempAbilityScore.setSavingThrows(tempSavingThrows);

            tempCharacter.setAbilityScore(tempAbilityScore);

            return new ResponseEntity<>(Map.of("character", tempCharacter), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }
}
