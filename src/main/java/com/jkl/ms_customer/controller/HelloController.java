package com.jkl.ms_customer.controller;


import com.jkl.ms_customer.dto.CustomerDto;
import com.jkl.ms_customer.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {

        return "Seja Bem-Vindo, " + name;
    }




}
