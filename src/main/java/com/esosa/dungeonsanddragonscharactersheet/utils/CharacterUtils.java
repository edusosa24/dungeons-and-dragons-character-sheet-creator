package com.esosa.dungeonsanddragonscharactersheet.utils;

import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
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
            ShortCharacterDTO tempShortCharacter = new ShortCharacterDTO(character.getId(),
                                                                         character.getName(),
                                                                         character.getGeneral().getCharacterClass(),
                                                                         character.getGeneral().getRace(),
                                                                         character.getGeneral().getLevel()
            );
            characterMap.put(String.valueOf(count), tempShortCharacter);
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
        long tempId;
        if(updatedCharacter.getName() != null){
            oldCharacter.setName(updatedCharacter.getName());
        }
        if(updatedCharacter.getAbilityScore() != null){
         /*   tempId = oldCharacter.getAbilityScore().getId();
            oldCharacter.setAbilityScore(updatedCharacter.getAbilityScore());
            oldCharacter.getAbilityScore().setId(tempId);
          */
        }
        if(updatedCharacter.getAppearance() != null){
            oldCharacter.setAbilityScore(updatedCharacter.getAbilityScore());
        }
        if(updatedCharacter.getBackstory() != null){
            oldCharacter.setAbilityScore(updatedCharacter.getAbilityScore());
        }
        if(updatedCharacter.getCombat() != null){
            oldCharacter.setCombat(updatedCharacter.getCombat());
        }
        if(updatedCharacter.getEquipmentAndMoney() != null){
            oldCharacter.setEquipmentAndMoney(updatedCharacter.getEquipmentAndMoney());
        }
        if(updatedCharacter.getFeaturesTraitsAndOtherProficiencies() != null){
            oldCharacter.setFeaturesTraitsAndOtherProficiencies(updatedCharacter.getFeaturesTraitsAndOtherProficiencies());
        }
        if(updatedCharacter.getGeneral() != null){
            oldCharacter.setGeneral(updatedCharacter.getGeneral());
        }
        if(updatedCharacter.getSpells() != null){
            oldCharacter.setAbilityScore(updatedCharacter.getAbilityScore());
        }
        return oldCharacter;
    }
}
