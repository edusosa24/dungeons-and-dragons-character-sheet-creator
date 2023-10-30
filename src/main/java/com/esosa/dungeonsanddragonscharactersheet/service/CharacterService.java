package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.utils.CharacterUtils;

import java.util.Map;

public interface CharacterService {
    void createCharacter(Character newCharacter);
    Character getCharacter(Long characterId);
    void updateCharacter(Long characterId, Character character);
    Map<String, Object> getCharactersFromUser(Long userId);
    void deleteCharacter(Long characterId);
}
