package com.jkl.ms_customer.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Admin extends Person {

    @Column(unique = true)
    private String employeeCode;
}
