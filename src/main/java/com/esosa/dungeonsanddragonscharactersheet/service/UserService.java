package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.security.model.SecurityUser;

public interface UserService {
    void createUser(UserDTO newUser);
    void deleteUser(String username, SecurityUser user);
}
