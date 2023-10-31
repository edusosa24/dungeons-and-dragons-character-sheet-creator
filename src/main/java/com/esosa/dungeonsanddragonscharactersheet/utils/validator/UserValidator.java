package com.esosa.dungeonsanddragonscharactersheet.utils.validator;

import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.UserAlreadyExistsException;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.UserInvalidDataException;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.UserNotFoundException;

public class UserValidator {
    public static void validateUser(User user, UserDTO userDTO){
        if(userDTO == null){
            throw new UserInvalidDataException("User cannot be null");
        }
        if(user != null){
            throw new UserAlreadyExistsException(String.format("User %s already exists", user.getUsername()));
        }
    }

    public static void validateUser(User user, Long id){
        if(user == null){
            throw new UserNotFoundException(String.format("User with id %l not found", id));
        }
    }
}
