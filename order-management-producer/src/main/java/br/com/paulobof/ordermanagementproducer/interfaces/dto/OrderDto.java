package br.com.paulobof.ordermanagementproducer.interfaces.dto;

import br.com.paulobof.ordermanagementproducer.domain.entities.OrderItem;
import br.com.paulobof.ordermanagementproducer.domain.enums.OrderStatus;

import java.util.Date;
import java.util.List;

public record OrderDto(
        Long orderCode,
        Date orderDate,
        int orderStatus,
        Long clientCode,
        Long orderItems
) {

}