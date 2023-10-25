package com.esosa.dungeonsanddragonscharactersheet.utils;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterUtils {

    public CharacterUtils() {}

    public static Map<String, Object> charactersMap(List<Character> characters){
        Map<String, Object> characterMap = new HashMap<>();
        int count = 0;
        for(Character character : characters){
            characterMap.put("Character " + count, character);
            count++;
        }
        return characterMap;
    }
}
