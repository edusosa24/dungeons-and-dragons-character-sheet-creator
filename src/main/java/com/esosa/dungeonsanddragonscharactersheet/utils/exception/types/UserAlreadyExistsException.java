package com.esosa.dungeonsanddragonscharactersheet.utils.exception.types;

public class UserAlreadyExistsException  extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
