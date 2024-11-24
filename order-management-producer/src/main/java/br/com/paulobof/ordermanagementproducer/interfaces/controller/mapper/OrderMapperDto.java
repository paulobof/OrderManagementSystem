package br.com.paulobof.ordermanagementproducer.interfaces.controller.mapper;

import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import br.com.paulobof.ordermanagementproducer.interfaces.dto.OrderDto;

public class OrderMapperDto {

    public static OrderDto toOrderDto(Order order) {
        return new OrderDto(
                order.getOrderCode(),
                order.getOrderDate(),
                order.getOrderStatus(),
                order.getClientCode(),
                order.getOrderItems()
                );
    }

    public static Order toOrder(OrderDto orderDto) {
        return new Order(
                orderDto.orderCode(),
                orderDto.orderDate(),
                orderDto.orderStatus(),
                orderDto.clientCode(),
                orderDto.orderItems()
        );
    }
}

