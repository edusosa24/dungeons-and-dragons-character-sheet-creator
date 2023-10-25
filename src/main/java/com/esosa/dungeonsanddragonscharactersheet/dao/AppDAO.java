package com.esosa.dungeonsanddragonscharactersheet.dao;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;

import java.util.List;

public interface AppDAO {
    /*                       */
    /*     USER FUNCTIONS    */
    /*                       */
    void createUser(User newUser);
    User getUser(long userId);
    void deleteUser(long userId);


    /*                       */
    /*  CHARACTER FUNCTIONS  */
    /*                       */
    void createCharacter(Character newCharacter);
    Character getCharacter(long characterId);
    void updateCharacter(Character updatedCharacter);
    List<Character> getCharactersFromUser(long userId);
    void deleteCharacter(long characterId);
}
