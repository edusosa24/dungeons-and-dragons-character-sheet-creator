package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;

public interface UserService {
    void createUser(User newUser);
    User getUser(long userId);
    void deleteUser(long userId);
}
