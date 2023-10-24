package com.esosa.dungeonsanddragonscharactersheet.entity.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "username", unique = true)
    @NotNull(message = "Username cannot be null")
    @Size(min = 6, max =  16, message = "Username must be between 6 and 16 characters long")
    @Pattern(regexp = "^[A-Za-z0-9]$", message = "Username can only contain letters and numbers")
    private String username;

    @Column(name = "password")
    @NotNull(message = "Password cannot be null")
    @Size(min = 8, max =  16, message = "Password must be between 8 and 16 characters long")
    @Pattern(regexp = "^[A-Za-z0-9@#$%^&+=*!_()]$", message = "Password can contain letters, numbers, and @#$%^&+=*!_()")
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
