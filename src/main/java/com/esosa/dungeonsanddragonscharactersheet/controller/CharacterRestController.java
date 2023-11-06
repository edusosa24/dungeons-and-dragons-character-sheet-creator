package com.esosa.dungeonsanddragonscharactersheet.controller;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.security.model.SecurityUser;
import com.esosa.dungeonsanddragonscharactersheet.service.CharacterService;
import com.esosa.dungeonsanddragonscharactersheet.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/character")
public class CharacterRestController {

    private final CharacterService characterService;

    @Autowired
    public CharacterRestController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterDTO> getCharacter(@PathVariable @Valid Long characterId){
        CharacterDTO tempCharacter = characterService.getCharacter(characterId);
        return new ResponseEntity<>(tempCharacter, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> createCharacter(
            @RequestBody @Valid CharacterDTO character,
            @AuthenticationPrincipal SecurityUser user
    ){
            Long newCharacterId = characterService.createCharacter(character, user);
            return new ResponseEntity<>(
                Map.of("message", String.format("Character %s successfully created with id of %d",
                            character.getName(),
                            newCharacterId)),
                HttpStatus.CREATED);
    }

    @PutMapping("/{characterId}")
    public ResponseEntity<CharacterDTO> updateCharacter(@PathVariable @Valid Long characterId,
                                                        @RequestBody @Valid CharacterDTO character,
                                                        @AuthenticationPrincipal SecurityUser user){
        characterService.updateCharacter(characterId, character, user);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @GetMapping("/user/{username}")
    public ResponseEntity<Map<String, ShortCharacterDTO>> getCharactersFromUser(@PathVariable @Valid String username){
        Map<String, ShortCharacterDTO> characters = characterService.getCharactersFromUser(username);
        if(characters.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @DeleteMapping("/{characterId}")
    public ResponseEntity<Map<String, String>> deleteCharacter(
            @PathVariable @Valid Long characterId,
            @AuthenticationPrincipal SecurityUser user
    ){
        characterService.deleteCharacter(characterId, user);
        return new ResponseEntity<>(
                Map.of("message", String.format("Character with id %d successfully deleted",
                        characterId)),
                HttpStatus.OK);
    }
}
