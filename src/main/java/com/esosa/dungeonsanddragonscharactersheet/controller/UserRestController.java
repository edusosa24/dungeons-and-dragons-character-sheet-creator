package com.esosa.dungeonsanddragonscharactersheet.controller;

import com.esosa.dungeonsanddragonscharactersheet.dao.AppDAO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class UserRestController {

    private AppDAO appDAO;

    @Autowired
    public UserRestController(AppDAO appDAO) {
        this.appDAO = appDAO;
    }

    @PostMapping(value = "/")
    public ResponseEntity<Map<String, Object>> createUser(@RequestBody Map<String, String> userData){
        try {
            User tempUser = new User(userData.get("username"), userData.get("password"));
            appDAO.createUser(tempUser);
            return new ResponseEntity<>(Map.of("message", "User " + tempUser.getUsername() + " successfully created."), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", "Username already exist."), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Map<String, Object>> getUser(@PathVariable long userId){
        try {
            User tempUser = appDAO.getUser(userId);
            if(tempUser == null) {
                throw new RuntimeException("User id " + userId + " was not found.");
            }
            return new ResponseEntity<>(Map.of("user", tempUser), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Map<String, Object>> deleteUser(@PathVariable long userId) {
        try {
            User tempUser = appDAO.getUser(userId);
            if(tempUser == null) {
                throw new RuntimeException("User id " + userId + " was not found.");
            }
            appDAO.deleteUser(userId);
            return new ResponseEntity<>(Map.of("message", "User " + tempUser.getUsername() + " successfully deleted."), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", "User id " + userId + " does not exist."), HttpStatus.BAD_REQUEST);
        }
    }
}
