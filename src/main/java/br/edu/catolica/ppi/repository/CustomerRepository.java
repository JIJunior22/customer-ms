package br.edu.catolica.ppi.repository;

import br.edu.catolica.ppi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByCpfAndIsActiveTrue(String cpf);
}
