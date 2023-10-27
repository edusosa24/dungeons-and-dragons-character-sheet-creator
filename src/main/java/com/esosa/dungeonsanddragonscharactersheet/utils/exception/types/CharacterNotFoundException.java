package com.esosa.dungeonsanddragonscharactersheet.utils.exception.types;

public class CharacterNotFoundException  extends RuntimeException{
    public CharacterNotFoundException(String message) {
        super(message);
    }
}
