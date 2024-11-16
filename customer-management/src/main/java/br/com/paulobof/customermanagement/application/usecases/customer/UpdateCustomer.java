package br.com.paulobof.customermanagement.application.usecases.customer;

import br.com.paulobof.customermanagement.application.gateway.ICustomerRepository;
import br.com.paulobof.customermanagement.domain.entities.Customer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateCustomer {

    private final ICustomerRepository customerRepository;

    Customer updateCustomer(Customer customer){
        return customerRepository.updateCustomer(customer);
    }
}
