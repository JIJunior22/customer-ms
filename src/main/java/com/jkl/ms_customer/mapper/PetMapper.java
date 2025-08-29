package com.jkl.ms_customer.mapper;


import com.jkl.ms_customer.domain.Pet;
import com.jkl.ms_customer.dto.PetDto;
import com.jkl.ms_customer.enums.Species;
import org.springframework.stereotype.Component;

@Component
public class PetMapper {


    public Pet dtoToEntity(PetDto dto) {
        return Pet.builder()
                .name(dto.getName())
                .specie(Species.fromString(dto.getSpecie()))
                .build();
    }
}
