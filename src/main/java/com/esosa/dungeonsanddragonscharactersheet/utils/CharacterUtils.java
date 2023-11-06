package com.esosa.dungeonsanddragonscharactersheet.utils;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.UserAccessDeniedException;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.UserNotFoundException;
import com.esosa.dungeonsanddragonscharactersheet.utils.mapper.CharacterMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CharacterUtils {

    public CharacterUtils() {
    }

    public Map<String, ShortCharacterDTO> charactersMap(List<Character> characters){
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

    public void characterUpdate(CharacterDTO characterUpdates, Character character) {
        CharacterMapper.characterDTOToCharacter(characterUpdates, character);
    }

    public CharacterDTO responseCharacter(Character character) {
        CharacterDTO characterDTO = new CharacterDTO();
        CharacterMapper.characterToCharacterDTO(character, characterDTO);
        return characterDTO;
    }
}
