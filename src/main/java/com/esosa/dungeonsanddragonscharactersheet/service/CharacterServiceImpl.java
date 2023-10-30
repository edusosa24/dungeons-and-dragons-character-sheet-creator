package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.repository.CharacterRepository;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.utils.CharacterUtils;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.CharacterNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CharacterServiceImpl implements CharacterService{
    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    @Transactional
    public void createCharacter(Character newCharacter) {
        characterRepository.save(newCharacter);
    }

    @Override
    public Character getCharacter(Long characterId) {
        Character tempCharacter = characterRepository.findById(characterId).orElseThrow(() -> new CharacterNotFoundException("Character with id :" + characterId + " not found."));
        return tempCharacter;
    }

    @Override
    @Transactional
    public void updateCharacter(Long characterId, Character character) {
        Character tempCharacter = characterRepository.findById(characterId).orElseThrow(() -> new CharacterNotFoundException("Character with id: " + characterId + " not found."));

        characterRepository.save(character);
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
