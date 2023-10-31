package com.esosa.dungeonsanddragonscharactersheet.utils;

import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.utils.mapper.UserMapper;

public class UserUtils {


    public static User newUser(UserDTO userDTO){
        User user = new User();
        UserMapper.userDTOToUser(userDTO, user);
        return user;
    }

    public static UserDTO userResponse(User user) {
        UserDTO userDTO = new UserDTO();
        UserMapper.userToUserDTO(user, userDTO);
        return userDTO;
    }
}
