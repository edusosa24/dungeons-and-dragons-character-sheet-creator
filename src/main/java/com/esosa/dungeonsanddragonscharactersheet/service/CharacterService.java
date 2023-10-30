package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import java.util.Map;

public interface CharacterService {
    Long createCharacter(String newCharacter);
    CharacterDTO getCharacter(Long characterId);
    void updateCharacter(Long characterId, CharacterDTO character);
    Map<String, Object> getCharactersFromUser(Long userId);
    void deleteCharacter(Long characterId);
}
