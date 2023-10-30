package com.esosa.dungeonsanddragonscharactersheet.utils;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

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

    public static void characterUpdate(CharacterDTO characterUpdates, Character character) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.map(characterUpdates, character);
    }

    public static CharacterDTO responseCharacter(Character character) {
        CharacterDTO responseCharacter = new CharacterDTO();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.map(character, responseCharacter);

        return responseCharacter;
    }
}
