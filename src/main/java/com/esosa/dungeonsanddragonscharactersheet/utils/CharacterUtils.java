package com.esosa.dungeonsanddragonscharactersheet.utils;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.utils.mapper.CharacterMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterUtils {

    public CharacterUtils() {
    }

    public static Map<String, ShortCharacterDTO> charactersMap(List<Character> characters){
        Map<String, ShortCharacterDTO> characterMap = new HashMap<>();
        int count = 0;
        for(Character character : characters){
            ShortCharacterDTO tempShortCharacter = new ShortCharacterDTO();
            CharacterMapper.characterToShortCharacterDTO(character, tempShortCharacter);
            characterMap.put(String.valueOf(count), tempShortCharacter);
            count++;
        }
        return characterMap;
    }

    public static void characterUpdate(CharacterDTO characterUpdates, Character character) {
        CharacterMapper.characterDTOToCharacter(characterUpdates, character);
    }

    public static CharacterDTO responseCharacter(Character character) {
        CharacterDTO characterDTO = new CharacterDTO();
        CharacterMapper.characterToCharacterDTO(character, characterDTO);
        return characterDTO;
    }
}
