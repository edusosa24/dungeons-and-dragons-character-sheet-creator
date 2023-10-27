package com.esosa.dungeonsanddragonscharactersheet.dao;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public void createUser(User newUser) {
        entityManager.merge(newUser);

    }

    @Override
    public User getUser(long userId) {
        User theUser = entityManager.find(User.class, userId);
        return theUser;
    }

    @Override
    public void deleteUser(long userId) {
        User theUser = entityManager.find(User.class, userId);
        entityManager.remove(theUser);
    }


    /*                           */
    /* CHARACTER IMPLEMENTATIONS */
    /*                           */

    @Override
    public void createCharacter(Character newCharacter) {
        entityManager.merge(newCharacter);
    }

    @Override
    public Character getCharacter(long characterId) {
        Character theCharacter = entityManager.find(Character.class, characterId);
        return theCharacter;
    }

    @Override
    public void updateCharacter(Character updatedCharacter) {
        entityManager.merge(updatedCharacter);
    }

    @Override
    public List<Character> getCharactersFromUser(long userId) {
        TypedQuery<Character> theQuery = entityManager.createQuery("FROM Character WHERE user.id = :data", Character.class);
        theQuery.setParameter("data", userId);
        List<Character> characters = theQuery.getResultList();
        return characters;
    }

    @Override
    public void deleteCharacter(long characterId) {
        Character theCharacter = entityManager.find(Character.class, characterId);
        entityManager.remove(theCharacter);
    }

}
