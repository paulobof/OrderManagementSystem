package br.com.paulobof.customermanagement.application.usecases.customer;

import br.com.paulobof.customermanagement.application.gateway.ICustomerRepository;
import br.com.paulobof.customermanagement.domain.entities.Customer;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetAllCustomer {

    private final ICustomerRepository customerRepository;

    List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

}
