package com.esosa.dungeonsanddragonscharactersheet.utils.exception.types;

public class UserAccessDeniedException  extends RuntimeException{
    public UserAccessDeniedException(String message) {
        super(message);
    }
}
