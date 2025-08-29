package com.jkl.ms_customer.controller;

import com.jkl.ms_customer.dto.CustomerDto;
import com.jkl.ms_customer.dto.ResponseDto;
import com.jkl.ms_customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/custumer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/crate")
    public ResponseEntity<ResponseDto> save(CustomerDto customerDto) {


    }
}
