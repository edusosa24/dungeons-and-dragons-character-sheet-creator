package com.esosa.dungeonsanddragonscharactersheet.utils.validator;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import com.esosa.dungeonsanddragonscharactersheet.security.model.SecurityUser;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.CharacterInvalidDataException;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.CharacterNotFoundException;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.UserAccessDeniedException;
import com.esosa.dungeonsanddragonscharactersheet.utils.exception.types.UserNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CharacterValidator {

    public CharacterValidator() {
    }

    public void validateCharacterCreation(CharacterDTO characterDTO){
        if(characterDTO == null){
            throw new CharacterInvalidDataException("Character must have a name");
        }
        if(characterDTO.getName() == null){
            throw new CharacterInvalidDataException("Character name cannot be null");
        }
    }

    public void validateCharacterExists(Character character, Long id){
        if(character == null){
            throw new CharacterNotFoundException(String.format("Character with id '%d' not found", id));
        }
    }

    public void validateCharacterUpdate(Character character, Long id, SecurityUser user){
        validateCharacterExists(character, id);
        String username = character.getUser().getUsername();
        if(!user.getUsername().equals(username)){
            throw new UserAccessDeniedException(String.format("User %s cannot update this character", user.getUsername()));
        }
    }

    public void validateCharacterDelete(Character character, Long id, SecurityUser user){
        validateCharacterExists(character, id);
        String username = character.getUser().getUsername();
        if(!user.getUsername().equals(username)){
            throw new UserAccessDeniedException(String.format("User %s cannot delete this character", user.getUsername()));
        }
    }
}
