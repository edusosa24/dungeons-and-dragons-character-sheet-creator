package com.esosa.dungeonsanddragonscharactersheet.utils;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.components.*;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterUtils {

    public CharacterUtils() {
    }

    public static Map<String, Object> charactersMap(List<Character> characters){
        Map<String, Object> characterMap = new HashMap<>();
        int count = 0;
        for(Character character : characters){
            characterMap.put("Character " + count, character);
            count++;
        }
        return characterMap;
    }

    /*
    public static Character characterBuild(String name, User user){
        Character tempCharacter = new Character(name, user);
        tempCharacter.setAbilityScore(new AbilityScore());
        tempCharacter.setGeneral(new General());
        tempCharacter.setCombat(new Combat());
        tempCharacter.setAppearance(new Appearance());
        tempCharacter.setEquipmentAndMoney(new EquipmentAndMoney());
        tempCharacter.setFeaturesTraitsAndOtherProficiencies(new FeaturesTraitsAndOtherProficiencies());
        tempCharacter.setSpells(new Spells());
        tempCharacter.setBackstory(new Backstory());

        return tempCharacter;
    }
    */

    public static Character characterUpdate(Character updatedCharacter, Character oldCharacter){
        /*
        updatedCharacter.setUser(oldCharacter.getUser());
        updatedCharacter.setLastModified(new Timestamp(System.currentTimeMillis()));
        */
        if(updatedCharacter.getAbilityScore() != null){
            oldCharacter.setAbilityScore(updatedCharacter.getAbilityScore());
        }
        if(updatedCharacter.getGeneral() != null){
            oldCharacter.setGeneral(updatedCharacter.getGeneral());
        }
        if(updatedCharacter.getFeaturesTraitsAndOtherProficiencies() != null){
            oldCharacter.setFeaturesTraitsAndOtherProficiencies(updatedCharacter.getFeaturesTraitsAndOtherProficiencies());
        }
        if(updatedCharacter.getEquipmentAndMoney() != null){
            oldCharacter.setEquipmentAndMoney(updatedCharacter.getEquipmentAndMoney());
        }
        if(updatedCharacter.getCombat() != null){
            oldCharacter.setCombat(updatedCharacter.getCombat());
        }
        if(updatedCharacter.getAbilityScore() != null){
            oldCharacter.setAbilityScore(updatedCharacter.getAbilityScore());
        }
        if(updatedCharacter.getAbilityScore() != null){
            oldCharacter.setAbilityScore(updatedCharacter.getAbilityScore());
        }

        return oldCharacter;
    }
}
