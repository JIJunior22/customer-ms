package br.edu.catolica.ppi.service;

import br.edu.catolica.ppi.domain.Pet;
import br.edu.catolica.ppi.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepository petRepository;

    public boolean existsPetToCustomer(Long id, Set<String> petsName) {
        return petRepository.existPetToCustomer(id, petsName);
    }

}
