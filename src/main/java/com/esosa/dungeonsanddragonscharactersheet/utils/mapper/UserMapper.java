package com.esosa.dungeonsanddragonscharactersheet.utils.mapper;

import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import org.modelmapper.ModelMapper;

public class UserMapper {
    private static ModelMapper modelMapper = new ModelMapper();
    {
        modelMapper.getConfiguration().setSkipNullEnabled(true);
    }

    public static void userToUserDTO(User user, UserDTO userDTO){
        modelMapper.map(user, userDTO);
    }

    public static void userDTOToUser(UserDTO userDTO, User user){
        modelMapper.map(userDTO, user);
    }
}
