package com.esosa.dungeonsanddragonscharactersheet.dao;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDAOImpl implements AppDAO{
    private EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /*                      */
    /* USER IMPLEMENTATIONS */
    /*                      */

    @Override
    @Transactional
    public void createUser(User newUser) {
        entityManager.persist(newUser);

    }

    @Override
    public User getUser(long userId) {
        User theUser = entityManager.find(User.class, userId);
        return theUser;
    }

    @Override
    @Transactional
    public void deleteUser(long userId) {
        User theUser = entityManager.find(User.class, userId);
        entityManager.remove(theUser);
    }


    /*                           */
    /* CHARACTER IMPLEMENTATIONS */
    /*                           */

    @Override
    @Transactional
    public void createCharacter(Character newCharacter) {
        entityManager.persist(newCharacter);
        System.out.println("Character -> " + newCharacter + " -> successfully created.");
    }

    @Override
    public Character getCharacter(long characterId) {
        Character theCharacter = entityManager.find(Character.class, characterId);
        return theCharacter;
    }

    @Override
    @Transactional
    public void deleteCharacter(long characterId) {
        Character theCharacter = entityManager.find(Character.class, characterId);
        entityManager.remove(theCharacter);
        System.out.println("Character -> " + theCharacter + " -> successfully deleted.");
    }

}
