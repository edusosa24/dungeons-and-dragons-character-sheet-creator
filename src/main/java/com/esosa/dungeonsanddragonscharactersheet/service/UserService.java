package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;

public interface UserService {
    void createUser(UserDTO newUser);
    User getUser(Long userId);
    void deleteUser(Long userId);
}
