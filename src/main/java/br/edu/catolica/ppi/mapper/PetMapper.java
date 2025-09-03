package br.edu.catolica.ppi.mapper;

import br.edu.catolica.ppi.domain.Pet;
import br.edu.catolica.ppi.dto.PetDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.Set;

@Mapper(componentModel = "spring")
@Component
public interface PetMapper {

    Set<Pet> dtoToEntity(Set<PetDTO> petDTO);

    Set<PetDTO> entityToDTO(Set<Pet> pets);
}
