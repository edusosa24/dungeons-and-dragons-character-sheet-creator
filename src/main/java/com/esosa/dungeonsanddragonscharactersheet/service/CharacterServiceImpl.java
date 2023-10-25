package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dao.AppDAO;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.utils.CharacterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
public class CharacterServiceImpl implements CharacterService{
    private AppDAO appDAO;

    @Autowired
    public CharacterServiceImpl(AppDAO appDAO) {
        this.appDAO = appDAO;
    }

    @Override
    @Transactional
    public void createCharacter(Character newCharacter) {
        appDAO.createCharacter(newCharacter);
    }

    @Override
    public Character getCharacter(long characterId) {
        Character tempCharacter = appDAO.getCharacter(characterId);
        return tempCharacter;
    }

    @Override
    @Transactional
    public void updateCharacter(Character character) {
        appDAO.updateCharacter(character);
    }

    @Override
    public Map<String, Object> getCharactersFromUser(long userId) {
        List<Character> charactersList = appDAO.getCharactersFromUser(userId);
        Map<String, Object> mappedCharacters = CharacterUtils.charactersMap(charactersList);
        return mappedCharacters;
    }

    @Override
    @Transactional
    public void deleteCharacter(long characterId) {
        appDAO.deleteCharacter(characterId);
    }
}
