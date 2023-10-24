package com.esosa.dungeonsanddragonscharactersheet.entity.character.components.combat;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "death_saves")
public class DeathSaves {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "success")
    @Min(value = 0, message = "Success cannot be smaller than 0")
    @Max(value = 3, message = "Success cannot be bigger than 3")
    private int success;

    @Column(name = "failure")
    @Min(value = 0, message = "Failure cannot be smaller than 0")
    @Max(value = 3, message = "Failure cannot be bigger than 3")
    private int failure;

    public DeathSaves() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getFailure() {
        return failure;
    }

    public void setFailure(int failure) {
        this.failure = failure;
    }

    @Override
    public String toString() {
        return "DeathSaves{" +
                "success=" + success +
                ", failure=" + failure +
                '}';
    }
}
