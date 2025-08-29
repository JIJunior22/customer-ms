package com.jkl.ms_customer.service;


import com.jkl.ms_customer.dto.CustomerDto;
import com.jkl.ms_customer.repository.IPetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final IPetRepository petRepository;


    public void save(CustomerDto customerDto){

    }



}
