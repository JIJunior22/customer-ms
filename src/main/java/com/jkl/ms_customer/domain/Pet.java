package com.jkl.ms_customer.domain;


import com.jkl.ms_customer.enums.Species;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pet extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Species specie;

    @ManyToMany(mappedBy = "pet")
    private Set<Customer> customers;



}
