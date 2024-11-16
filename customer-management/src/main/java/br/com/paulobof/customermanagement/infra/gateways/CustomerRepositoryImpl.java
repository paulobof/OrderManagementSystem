package br.com.paulobof.customermanagement.infra.gateways;

import br.com.paulobof.customermanagement.application.gateway.ICustomerRepository;
import br.com.paulobof.customermanagement.domain.entities.Customer;
import br.com.paulobof.customermanagement.infra.mapper.CustomerMapper;
import br.com.paulobof.customermanagement.infra.persistence.entities.CustomerEntity;
import br.com.paulobof.customermanagement.infra.persistence.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class CustomerRepositoryImpl  implements ICustomerRepository {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public Customer createCustomer(Customer customer) {
        CustomerEntity customerEntity = customerMapper.toEntity(customer);
        customerEntity = customerRepository.save(customerEntity);
        return customerMapper.toCustomer(customerEntity);
    }

    public List<Customer> getAllCustomer() {
        return null;
    }

    public Customer getByCustomerCode(Long customerCode) {
        return null;
    }

    public Customer updateCustomer(Customer customer) {
        return null;
    }

    public void deleteCustomer(Long customerCode) {

    }

    public  Boolean existsCustomer(Long customerCode) {
        return false;
    }

}
