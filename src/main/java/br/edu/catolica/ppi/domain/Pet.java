package br.edu.catolica.ppi.domain;

import br.edu.catolica.ppi.enums.Specie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pet extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Specie specie;

    @ManyToMany(mappedBy = "pets")
    private Set<Customer> customers;

}
