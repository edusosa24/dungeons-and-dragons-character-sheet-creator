package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.repository.UserRepository;
import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.security.model.SecurityUser;
import com.esosa.dungeonsanddragonscharactersheet.utils.UserUtils;
import com.esosa.dungeonsanddragonscharactersheet.utils.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Encoder;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    @Override
    @Transactional
    public void createUser(UserDTO newUser) {
        User validateUser = userRepository.findByUsername(newUser.getUsername()).orElse(null);
        UserValidator.validateUser(validateUser, newUser);
        User tempUser = UserUtils.newUser(newUser);
        System.out.println(newUser.getPassword());
        tempUser.setPassword(encoder.encode(newUser.getPassword()));
        System.out.println(tempUser.getPassword());
        userRepository.save(tempUser);
    }

    @Override
    @Transactional
    public void deleteUser(String username, SecurityUser user) {
        UserValidator.validateUser(user, username);
        User tempUser = userRepository.findByUsername(username).orElse(null);
        UserValidator.validateUser(tempUser, username);
        userRepository.deleteByUsername(username);
    }
}
