package br.com.paulobof.customermanagement.infra.persistence.repository;

import br.com.paulobof.customermanagement.infra.persistence.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    Optional<CustomerEntity> getByCustomerCode(Long customerCode);
}
