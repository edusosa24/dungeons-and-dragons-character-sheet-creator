package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;

import java.util.Map;

public interface CharacterService {
    Long createCharacter(CharacterDTO characterDTO);
    CharacterDTO getCharacter(Long characterId);
    void updateCharacter(Long characterId, CharacterDTO character);
    Map<String, ShortCharacterDTO> getCharactersFromUser(Long userId);
    void deleteCharacter(Long characterId);
}
