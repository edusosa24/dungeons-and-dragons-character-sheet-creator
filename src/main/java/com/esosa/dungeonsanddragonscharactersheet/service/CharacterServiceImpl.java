package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.repository.CharacterRepository;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.repository.UserRepository;
import com.esosa.dungeonsanddragonscharactersheet.security.model.SecurityUser;
import com.esosa.dungeonsanddragonscharactersheet.utils.CharacterUtils;
import com.esosa.dungeonsanddragonscharactersheet.utils.validator.CharacterValidator;
import com.esosa.dungeonsanddragonscharactersheet.utils.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
public class CharacterServiceImpl implements CharacterService{
    private final CharacterRepository characterRepository;
    private final UserRepository userRepository;
    private final CharacterUtils characterUtils;
    private final CharacterValidator characterValidator;

    @Autowired
    public CharacterServiceImpl(
            CharacterRepository characterRepository,
            UserRepository userRepository,
            CharacterUtils characterUtils,
            CharacterValidator characterValidator
        ) {
        this.characterRepository = characterRepository;
        this.userRepository = userRepository;
        this.characterUtils = characterUtils;
        this.characterValidator = characterValidator;
    }

    @Override
    @Transactional
    public Long createCharacter(CharacterDTO characterDTO, SecurityUser user) {
        characterValidator.validateCharacterCreation(characterDTO);
        User characterUser = userRepository.findByUsername(user.getUsername()).orElse(null);
        Character character = new Character(characterDTO.getName(), characterUser);
        characterUtils.characterUpdate(characterDTO, character);
        characterRepository.save(character);
        return character.getId();
    }

    @Override
    public CharacterDTO getCharacter(Long characterId) {
        Character tempCharacter = characterRepository.findById(characterId).orElse(null);
        characterValidator.validateCharacterExists(tempCharacter, characterId);
        return characterUtils.responseCharacter(tempCharacter);
    }

    @Override
    @Transactional
    public void updateCharacter(Long characterId, CharacterDTO characterUpdates, SecurityUser user) {
        Character tempCharacter = characterRepository.findById(characterId).orElse(null);
        characterValidator.validateCharacterUpdate(tempCharacter, characterId, user);
        characterUtils.characterUpdate(characterUpdates, tempCharacter);
        characterRepository.save(tempCharacter);
    }

    @Override
    public Map<String, ShortCharacterDTO> getCharactersFromUser(String username) {
        List<Character> charactersList = characterRepository.getCharactersFromUser(username);
        return characterUtils.charactersMap(charactersList);
    }

    @Override
    @Transactional
    public void deleteCharacter(Long characterId, SecurityUser user) {
        Character tempCharacter = characterRepository.findById(characterId).orElse(null);
        characterValidator.validateCharacterDelete(tempCharacter, characterId, user);
        tempCharacter.setUser(null);
        characterRepository.deleteById(characterId);
    }
}
