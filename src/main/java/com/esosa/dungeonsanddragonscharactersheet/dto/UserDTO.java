package com.esosa.dungeonsanddragonscharactersheet.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserDTO {
    @NotNull(message = "Username cannot be null")
    @Size(min = 6, max =  16, message = "Username must be between 6 and 16 characters long")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "Username can only contain letters and numbers")
    private String username;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, max =  16, message = "Password must be between 8 and 16 characters long")
    @Pattern(regexp = "^[A-Za-z0-9@#+*!_()]+$", message = "Password can contain letters, numbers, and @#+*!_()")
    private String password;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
