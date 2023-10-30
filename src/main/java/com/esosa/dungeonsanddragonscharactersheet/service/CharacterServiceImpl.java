package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.repository.CharacterRepository;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.repository.UserRepository;
import com.esosa.dungeonsanddragonscharactersheet.utils.CharacterUtils;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.CharacterNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
public class CharacterServiceImpl implements CharacterService{
    private final CharacterRepository characterRepository;
    private final UserService userService;


    @Autowired
    public CharacterServiceImpl(CharacterRepository characterRepository, UserService userService) {
        this.characterRepository = characterRepository;
        this.userService = userService;
    }

    @Override
    @Transactional
    public Long createCharacter(String characterName) {
        User user = userService.getUser(Long.valueOf(1));
        Character character = new Character(characterName, user);
        characterRepository.save(character);
        return character.getId();
    }

    @Override
    public CharacterDTO getCharacter(Long characterId) {
        Character tempCharacter = characterRepository.findById(characterId).orElseThrow(() -> new CharacterNotFoundException("Character with id :" + characterId + " not found."));
        CharacterDTO responseCharacter = CharacterUtils.responseCharacter(tempCharacter);
        return responseCharacter;
    }

    @Override
    @Transactional
    public void updateCharacter(Long characterId, CharacterDTO characterUpdates) {
        Character tempCharacter = characterRepository.findById(characterId).orElseThrow(() -> new CharacterNotFoundException("Character with id: " + characterId + " not found."));
        CharacterUtils.characterUpdate(characterUpdates, tempCharacter);
        characterRepository.save(tempCharacter);
    }

    @Override
    public Map<String, Object> getCharactersFromUser(Long userId) {
        List<Character> charactersList = characterRepository.getCharactersFromUser(userId);
        Map<String, Object> mappedCharacters = CharacterUtils.charactersMap(charactersList);
        return mappedCharacters;
    }

    @Override
    @Transactional
    public void deleteCharacter(Long characterId) {
        characterRepository.deleteById(characterId);
    }
}
