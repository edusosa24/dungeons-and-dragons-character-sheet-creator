package com.esosa.dungeonsanddragonscharactersheet.controller;

import com.esosa.dungeonsanddragonscharactersheet.dto.UserDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.service.UserService;
import com.esosa.dungeonsanddragonscharactersheet.utils.UserUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/")
    public ResponseEntity<UserDTO> createUser(@RequestBody @Valid UserDTO user){
        userService.createUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Map<String, String>> deleteUser(@PathVariable @Valid String username) {
        userService.deleteUser(username);
        return new ResponseEntity<>(
                Map.of("message", String.format("User %s successfully deleted", username)),
                HttpStatus.OK
        );
    }
}
