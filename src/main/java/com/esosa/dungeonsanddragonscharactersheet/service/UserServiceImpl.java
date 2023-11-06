package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.repository.CharacterRepository;
import com.esosa.dungeonsanddragonscharactersheet.repository.UserRepository;
import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.security.model.SecurityUser;
import com.esosa.dungeonsanddragonscharactersheet.utils.UserUtils;
import com.esosa.dungeonsanddragonscharactersheet.utils.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserValidator userValidator;
    private final UserUtils userUtils;
    private final CharacterRepository characterRepository;


    @Autowired
    public UserServiceImpl(
            UserRepository userRepository,
            UserValidator userValidator,
            UserUtils userUtils,
            CharacterRepository characterRepository
    ) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
        this.userUtils = userUtils;
        this.characterRepository = characterRepository;
    }

    @Override
    @Transactional
    public void createUser(UserDTO newUser) {
        User user = userRepository.findByUsername(newUser.getUsername()).orElse(null);
        userValidator.validateUserCreation(user, newUser);
        User tempUser = userUtils.newUser(newUser);
        userRepository.save(tempUser);
    }

    @Override
    @Transactional
    public void deleteUser(String username, SecurityUser user) {
        User tempUser = userRepository.findByUsername(username).orElse(null);
        userValidator.validateUserDeletion(tempUser, username);
        List<Character> characters = characterRepository.getCharactersFromUser(username);
        for (Character character : characters) {
            character.setUser(null);
            characterRepository.deleteById(character.getId());
        }
        userRepository.deleteByUsername(username);
    }
}
