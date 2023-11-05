package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.repository.CharacterRepository;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.repository.UserRepository;
import com.esosa.dungeonsanddragonscharactersheet.utils.CharacterUtils;
import com.esosa.dungeonsanddragonscharactersheet.utils.validator.CharacterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
public class CharacterServiceImpl implements CharacterService{
    private final CharacterRepository characterRepository;
    private final UserRepository userRepository;


    @Autowired
    public CharacterServiceImpl(CharacterRepository characterRepository, UserRepository userRepository) {
        this.characterRepository = characterRepository;
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public Long createCharacter(CharacterDTO characterDTO) {
        CharacterValidator.validateCharacter(characterDTO);
        User user = userRepository.findById(1L).orElse(new User("Prueba", "Necesariamente"));
        Character character = new Character(characterDTO.getName(), user);
        CharacterUtils.characterUpdate(characterDTO, character);
        characterRepository.save(character);
        return character.getId();
    }

    @Override
    public CharacterDTO getCharacter(Long characterId) {
        Character tempCharacter = characterRepository.findById(characterId).orElse(null);
        CharacterValidator.validateCharacter(tempCharacter, characterId);
        return CharacterUtils.responseCharacter(tempCharacter);
    }

    @Override
    @Transactional
    public void updateCharacter(Long characterId, CharacterDTO characterUpdates) {
        Character tempCharacter = characterRepository.findById(characterId).orElse(null);
        CharacterValidator.validateCharacter(tempCharacter, characterId);
        CharacterUtils.characterUpdate(characterUpdates, tempCharacter);
        characterRepository.save(tempCharacter);
    }

    @Override
    public Map<String, ShortCharacterDTO> getCharactersFromUser(Long userId) {
        List<Character> charactersList = characterRepository.getCharactersFromUser(userId);
        return CharacterUtils.charactersMap(charactersList);
    }

    @Override
    @Transactional
    public void deleteCharacter(Long characterId) {
        Character tempCharacter = characterRepository.findById(characterId).orElse(null);
        CharacterValidator.validateCharacter(tempCharacter, characterId);
        tempCharacter.setUser(null);
        characterRepository.deleteById(characterId);
    }
}
