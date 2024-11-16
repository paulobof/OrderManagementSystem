package br.com.paulobof.customermanagement.infra.config;

import br.com.paulobof.customermanagement.application.gateway.ICustomerRepository;
import br.com.paulobof.customermanagement.application.usecases.customer.CreateCustomer;
import br.com.paulobof.customermanagement.application.usecases.customer.GetByCustomerCode;
import br.com.paulobof.customermanagement.infra.mapper.CustomerMapper;
import br.com.paulobof.customermanagement.infra.gateways.CustomerRepositoryImpl;
import br.com.paulobof.customermanagement.infra.persistence.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "br.com.paulobof.customermanagement.infra.persistence.repository")
public class CustomerConfig {

    @Bean
    CreateCustomer createCustomer(ICustomerRepository customerRepository) {
        return new CreateCustomer(customerRepository);
    }

    @Bean
    CustomerRepositoryImpl customCustomerRepositoryImpl (CustomerRepository customerRepository, CustomerMapper customerEntityMapper) {
        return new CustomerRepositoryImpl(customerRepository, customerEntityMapper);
    }

    @Bean
    CustomerMapper customerEntityMapper() {
        return new CustomerMapper();
    }

    @Bean
    GetByCustomerCode searchCustomerById(ICustomerRepository customerRepository) {
        return new GetByCustomerCode(customerRepository);
    }
}

