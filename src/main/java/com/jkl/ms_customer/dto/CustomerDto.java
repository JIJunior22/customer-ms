package com.jkl.ms_customer.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class CustomerDto {

    @NotBlank(message = "Name cant be null")
    private String name;
    @NotBlank(message = "CPF cant be null")
    @Size(min = 11, max = 11)
    private String cpf;
    @NotBlank(message = "e-mail cant be null")
    @Email
    private String email;

    private ContactDto contactDto;
    private Set<PetDto> petDto;


}
