package br.com.paulobof.customermanagement.infra.mapper;

import br.com.paulobof.customermanagement.infra.persistence.entities.CustomerEntity;
import br.com.paulobof.customermanagement.domain.entities.Customer;

public class CustomerMapper {

    public CustomerEntity toEntity(Customer customer) {
        return new CustomerEntity(
            customer.getName(),
            customer.getNumber(),
            customer.getEmail(),
            customer.getPhone(),
            customer.getAddress()
        );
    }

    public Customer toCustomer(CustomerEntity customerEntity) {
        return new Customer(
                customerEntity.getCustomerCode(),
                customerEntity.getName(),
                customerEntity.getNumber(),
                customerEntity.getEmail(),
                customerEntity.getPhone(),
                customerEntity.getAddress()
        );
    }

}

