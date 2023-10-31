package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.repository.UserRepository;
import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.utils.UserUtils;
import com.esosa.dungeonsanddragonscharactersheet.utils.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void createUser(UserDTO newUser) {
        User validateUser = userRepository.findByUsername(newUser.getUsername());
        UserValidator.validateUser(validateUser, newUser);
        User tempUser = UserUtils.newUser(newUser);
        // Encrypt password on UTILS
        userRepository.save(tempUser);
    }

    @Override
    public User getUser(Long userId) {
        User tempUser = userRepository.findById(userId).orElse(null);
        UserValidator.validateUser(tempUser, userId);
        return tempUser;
    }

    @Override
    @Transactional
    public void deleteUser(Long userId) {
        User tempUser = userRepository.findById(userId).orElse(null);
        UserValidator.validateUser(tempUser, userId);
        userRepository.deleteById(userId);
    }
}
