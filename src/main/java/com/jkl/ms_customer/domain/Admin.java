package com.jkl.ms_customer.domain;


import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends Person {

    @Column(unique = true)
    private String employeeCode;
}
