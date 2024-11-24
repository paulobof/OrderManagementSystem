package br.com.paulobof.ordermanagementproducer.infra.persistence.repository;

import br.com.paulobof.ordermanagementproducer.infra.persistence.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    Optional<OrderEntity> getByOrderCode(Long orderCode);
}
