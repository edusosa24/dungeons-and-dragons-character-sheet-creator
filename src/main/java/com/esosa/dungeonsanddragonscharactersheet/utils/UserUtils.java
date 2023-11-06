package com.esosa.dungeonsanddragonscharactersheet.utils;

import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.utils.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserUtils {

    private final PasswordEncoder encoder;

    @Autowired
    public UserUtils(PasswordEncoder encoder){
        this.encoder = encoder;
    }

    public User newUser(UserDTO userDTO){
        User user = new User();
        UserMapper.userDTOToUser(userDTO, user);
        user.setPassword(encoder.encode(userDTO.getPassword()));
        return user;
    }
}
