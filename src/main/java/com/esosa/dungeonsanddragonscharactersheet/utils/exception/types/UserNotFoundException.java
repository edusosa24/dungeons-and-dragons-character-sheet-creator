package com.esosa.dungeonsanddragonscharactersheet.utils.exception.types;

public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
