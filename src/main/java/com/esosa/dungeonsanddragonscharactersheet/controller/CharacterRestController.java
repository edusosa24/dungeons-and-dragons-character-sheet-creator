package com.esosa.dungeonsanddragonscharactersheet.controller;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.service.CharacterService;
import com.esosa.dungeonsanddragonscharactersheet.service.UserService;
import jakarta.validation.Valid;
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
    public ResponseEntity<CharacterDTO> getCharacter(@PathVariable @Valid Long characterId){
        CharacterDTO tempCharacter = characterService.getCharacter(characterId);
        return new ResponseEntity<>(tempCharacter, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Map<String, String>> createCharacter(@RequestBody @Valid CharacterDTO character/*, @AuthenticationPrincipal User user*/){
            Long newCharacterId = characterService.createCharacter(character);
            return new ResponseEntity<>(
                Map.of("message", String.format("Character %s successfully created with id of %d",
                            character.getName(),
                            newCharacterId)),
                HttpStatus.CREATED);
    }

    @PutMapping("/{characterId}")
    public ResponseEntity<CharacterDTO> updateCharacter(@PathVariable @Valid Long characterId,
                                                        @RequestBody @Valid CharacterDTO character){
        characterService.updateCharacter(characterId, character);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Map<String, ShortCharacterDTO>> getCharactersFromUser(@PathVariable Long userId){
        Map<String, ShortCharacterDTO> characters = characterService.getCharactersFromUser(userId);
        if(characters.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @DeleteMapping("/{characterId}")
    public ResponseEntity<Map<String, String>> deleteCharacter(@PathVariable @Valid Long characterId) {
        characterService.deleteCharacter(characterId);
        return new ResponseEntity<>(
                Map.of("message", String.format("Character with id %d successfully deleted",
                        characterId)),
                HttpStatus.OK);
    }
}
