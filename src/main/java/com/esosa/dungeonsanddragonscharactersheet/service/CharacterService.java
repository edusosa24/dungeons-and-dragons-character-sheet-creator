package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.security.model.SecurityUser;

import java.util.Map;

public interface CharacterService {
    Long createCharacter(CharacterDTO characterDTO, SecurityUser user);
    CharacterDTO getCharacter(Long characterId);
    void updateCharacter(Long characterId, CharacterDTO character, SecurityUser user);
    Map<String, ShortCharacterDTO> getCharactersFromUser(String username);
    void deleteCharacter(Long characterId, SecurityUser user);
}
