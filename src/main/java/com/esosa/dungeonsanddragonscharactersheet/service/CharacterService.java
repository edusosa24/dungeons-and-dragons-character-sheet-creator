package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.utils.CharacterUtils;

import java.util.Map;

public interface CharacterService {
    void createCharacter(Character newCharacter);
    Character getCharacter(long characterId);
    void updateCharacter(Character character);
    Map<String, Object> getCharactersFromUser(long userId);
    void deleteCharacter(long characterId);
}
