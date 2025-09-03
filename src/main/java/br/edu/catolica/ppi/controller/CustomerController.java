package br.edu.catolica.ppi.controller;

import br.edu.catolica.ppi.domain.Customer;
import br.edu.catolica.ppi.dto.CustomerDTO;
import br.edu.catolica.ppi.dto.ResponseDTO;
import br.edu.catolica.ppi.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import static br.edu.catolica.ppi.constants.CustomerConstants.CODE_STATUS_201;
import static br.edu.catolica.ppi.constants.CustomerConstants.CUSTOMER_MESSAGE_CREATED_201;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> save(@Valid @RequestBody CustomerDTO customerDTO) {
        customerService.save(customerDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ResponseDTO.builder()
                        .statusCode(CODE_STATUS_201)
                        .message(CUSTOMER_MESSAGE_CREATED_201)
                        .build());
    }

    @GetMapping("/findAll")
    public Page<CustomerDTO> findAll(Pageable pageable) {
        return customerService.findAll(pageable);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        customerService.deleteById(id);
        return ResponseEntity.noContent().build();

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Customer> ipdate(@PathVariable Long id, @RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.ok(customerService.updateCustomer(id, customerDTO));
    }

}
