package com.jkl.ms_customer.repository;

import com.jkl.ms_customer.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;


public interface IPetRepository extends JpaRepository<Long, Pet> {

    @Query("""
            select case when count(c) > 0 then true else false end
             from Pet p join p.customers c
              where c.id =: and p.name in :petsName
            
            """)
    boolean existsPetFromCustomer(@Param("id") Long id, @Param("petsName") Set<String> petsName);

}
