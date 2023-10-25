package com.esosa.dungeonsanddragonscharactersheet.controller;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.service.CharacterService;

import com.esosa.dungeonsanddragonscharactersheet.utils.CharacterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/character")
public class CharacterRestController {

    private CharacterService characterService;

    @Autowired
    public CharacterRestController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<Map<String, Object>> getCharacter(@PathVariable long characterId){
        try {
            Character tempCharacter = characterService.getCharacter(characterId);
            return new ResponseEntity<>(Map.of("character", tempCharacter), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Map<String, Object>> createCharacter(@RequestBody Map<String, String> characterName){
        try{
            Character tempCharacter = new Character(characterName.get("name"));
            characterService.createCharacter(tempCharacter);
            return new ResponseEntity<>(Map.of("message", "Character " + tempCharacter.getName() + " successfully created with id of " + tempCharacter.getId()), HttpStatus.CREATED);
        } catch(Exception e){
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{characterId}")
    public ResponseEntity<Map<String, Object>> updateCharacter(@PathVariable long characterId, @RequestBody Map<String, Character> character){
        try {
            Character tempCharacter = character.get("character");
            characterService.updateCharacter(tempCharacter);
            return new ResponseEntity<>(Map.of("character", tempCharacter), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Map<String, Object>> getCharactersFromUser(@PathVariable long userId){
        try {
            Map<String, Object> characters = characterService.getCharactersFromUser(userId);
            return new ResponseEntity<>(characters, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{characterId}")
    public ResponseEntity<Map<String, Object>> deleteCharacter(@PathVariable long characterId) {
        try {
            Character tempCharacter = characterService.getCharacter(characterId);
            characterService.deleteCharacter(characterId);
            return new ResponseEntity<>(Map.of("message", "User " + tempCharacter.getName() + " successfully deleted."), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }
}
