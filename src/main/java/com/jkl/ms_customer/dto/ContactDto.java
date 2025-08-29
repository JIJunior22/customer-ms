package com.jkl.ms_customer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactDto {


    @NotBlank(message = "Não pode ser nulo")
    @Size(min = 11, max = 11)
    private String mobileNumber;
    @NotBlank(message = "Não pode ser nulo")
    private String phone;
}
