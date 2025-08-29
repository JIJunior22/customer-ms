package com.jkl.ms_customer.mapper;


import com.jkl.ms_customer.domain.Customer;
import com.jkl.ms_customer.dto.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public Customer dtoToEntity(CustomerDto dto) {
        return Customer.builder()
                .pet(dto)
                .build();

    }

}
