package com.esosa.dungeonsanddragonscharactersheet.dto.character.combat;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class DeathSavesDTO {


    @Min(message = "Success cannot be smaller than 0", value = 0)
    @Max(message = "Success cannot be bigger than 3", value = 3)
    Integer success;
    @Min(message = "Failure cannot be smaller than 0", value = 0)
    @Max(message = "Failure cannot be bigger than 3", value = 3)
    Integer failure;

    public DeathSavesDTO() {
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Integer getFailure() {
        return failure;
    }

    public void setFailure(Integer failure) {
        this.failure = failure;
    }

    @Override
    public String toString() {
        return "DeathSavesDTO{" +
                "success=" + success +
                ", failure=" + failure +
                '}';
    }
}
