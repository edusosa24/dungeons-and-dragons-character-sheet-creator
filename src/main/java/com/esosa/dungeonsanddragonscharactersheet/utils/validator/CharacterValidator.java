package com.esosa.dungeonsanddragonscharactersheet.utils.validator;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.CharacterInvalidDataException;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.CharacterNotFoundException;

public class CharacterValidator {
    public static void validateCharacter(CharacterDTO characterDTO){
        if(characterDTO == null){
            throw new CharacterInvalidDataException("Character must have a name");
        }
        if(characterDTO.getName() == null){
            throw new CharacterInvalidDataException("Character name cannot be null");
        }
    }

    public static void validateCharacter(Character character, Long id){
        if(character == null){
            throw new CharacterNotFoundException(String.format("Character with id '%l' not found", id));
        }
    }
}
