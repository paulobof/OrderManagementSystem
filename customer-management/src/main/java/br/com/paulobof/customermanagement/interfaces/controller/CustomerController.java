package br.com.paulobof.customermanagement.interfaces.controller;

import br.com.paulobof.customermanagement.application.usecases.customer.CreateCustomer;
import br.com.paulobof.customermanagement.domain.entities.Customer;
import br.com.paulobof.customermanagement.interfaces.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CreateCustomer createCustomeUseCase;

    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer (@RequestBody CustomerDto customerDto) {
        Customer customer = createCustomeUseCase.createCustomer(
                new Customer(customerDto.name(), customerDto.email(), customerDto.phone(), customerDto.number(), customerDto.address()));

        return ResponseEntity.status(HttpStatus.CREATED).body(new CustomerDto(customer.getCustomerCode(), customer.getName(), customer.getNumber(), customer.getEmail(), customer.getPhone(), customer.getAddress()));
    }

}
