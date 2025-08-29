package com.jkl.ms_customer.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PetDto {

    @NotBlank(message = "Nome não pode ser nulo")
    private String name;
    @NotBlank(message = "Espécie não pode ser nula")
    private String specie;

}
