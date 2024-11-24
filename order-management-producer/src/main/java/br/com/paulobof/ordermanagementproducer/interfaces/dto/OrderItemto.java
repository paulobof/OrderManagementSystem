package br.com.paulobof.ordermanagementproducer.interfaces.dto;

import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import br.com.paulobof.ordermanagementproducer.domain.entities.OrderItem;

import java.util.Date;
import java.util.List;

public record OrderItemto(
        Long orderCode,
        int quantity,
        Long productCode,
        Order order
) {

}