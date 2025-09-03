package br.edu.catolica.ppi.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class CustomerDTO extends AbstractPersonDTO {

    private Set<PetDTO> petsDTO;

}
