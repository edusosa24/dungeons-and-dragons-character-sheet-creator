package com.esosa.dungeonsanddragonscharactersheet.controller;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import com.esosa.dungeonsanddragonscharactersheet.service.CharacterService;
import com.esosa.dungeonsanddragonscharactersheet.service.UserService;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.CharacterInvalidDataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/character")
public class CharacterRestController {

    private CharacterService characterService;
    private UserService userService;


    @Autowired
    public CharacterRestController(CharacterService characterService, UserService userService) {
        this.characterService = characterService;
        this.userService = userService;
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<Map<String, Object>> getCharacter(@PathVariable Long characterId){
        try {
            Character tempCharacter = characterService.getCharacter(characterId);
            return new ResponseEntity<>(Map.of("character", tempCharacter), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Map<String, Object>> createCharacter(@RequestBody Map<String, String> characterName/*, @AuthenticationPrincipal User user*/){
        try{
            if(characterName.get("name") != null){
                User user = userService.getUser(Long.valueOf(1));
                Character tempCharacter = new Character(characterName.get("name"), user);
                //Character tempCharacter = CharacterUtils.characterBuild(characterName.get("name"), user);
                characterService.createCharacter(tempCharacter);
                return new ResponseEntity<>(Map.of("message", "Character " + tempCharacter.getName() + " successfully created with id of " + tempCharacter.getId()), HttpStatus.CREATED);
            } else {
                throw new CharacterInvalidDataException("Field 'name' not found.");
            }
        } catch(Exception e){
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{characterId}")
    public ResponseEntity<Map<String, Object>> updateCharacter(@PathVariable Long characterId, @RequestBody Character character){
        try {
            // Character oldCharacter = characterService.getCharacter(characterId);
            // Character tempCharacter = CharacterUtils.characterUpdate(updatedCharacter, oldCharacter);
            characterService.updateCharacter(characterId, character);
            return new ResponseEntity<>(Map.of("character", character), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Map<String, Object>> getCharactersFromUser(@PathVariable Long userId){
        try {
            Map<String, Object> characters = characterService.getCharactersFromUser(userId);
            if(characters.size() == 0){
                return new ResponseEntity<>(characters, HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(characters, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{characterId}")
    public ResponseEntity<Map<String, Object>> deleteCharacter(@PathVariable Long characterId) {
        try {
            Character tempCharacter = characterService.getCharacter(characterId);
            characterService.deleteCharacter(characterId);
            return new ResponseEntity<>(Map.of("message", "User " + tempCharacter.getName() + " successfully deleted."), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("exception", e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }
}
