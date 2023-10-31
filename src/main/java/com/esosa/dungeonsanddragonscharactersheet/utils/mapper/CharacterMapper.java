package com.esosa.dungeonsanddragonscharactersheet.utils.mapper;

import com.esosa.dungeonsanddragonscharactersheet.dto.CharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.dto.ShortCharacterDTO;
import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import org.modelmapper.ModelMapper;

public class CharacterMapper {

    private static ModelMapper modelMapper = new ModelMapper();
    {
        modelMapper.getConfiguration().setSkipNullEnabled(true);
    }


    public static void characterToCharacterDTO(Character character, CharacterDTO characterDTO){
        modelMapper.map(character, characterDTO);
    }

    public static void characterDTOToCharacter(CharacterDTO characterDTO, Character character){
        modelMapper.map(characterDTO, character);
    }

    public static void characterToShortCharacterDTO(Character character, ShortCharacterDTO shortCharacterDTO){
        shortCharacterDTO.setId(character.getId());
        shortCharacterDTO.setName(character.getName());
        shortCharacterDTO.setCharacterClass(character.getGeneral().getCharacterClass());
        shortCharacterDTO.setRace(character.getGeneral().getRace());
        shortCharacterDTO.setLevel(character.getGeneral().getLevel());
    }
}
