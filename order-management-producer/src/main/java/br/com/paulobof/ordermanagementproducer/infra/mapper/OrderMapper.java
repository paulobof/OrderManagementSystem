package br.com.paulobof.ordermanagementproducer.infra.mapper;


import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import br.com.paulobof.ordermanagementproducer.infra.persistence.entities.OrderEntity;

public class OrderMapper {

    public OrderEntity toEntity(Order order) {
        return new OrderEntity(
                order.getOrderCode(),
                order.getOrderDate(),
                order.getOrderStatus(),
                order.getClientCode(),
                order.getOrderItems()
        );
    }

    public Order toOrder(OrderEntity orderEntity) {
        return new Order(
                orderEntity.getOrderCode(),
                orderEntity.getOrderDate(),
                orderEntity.getOrderStatus(),
                orderEntity.getClientCode(),
                orderEntity.getOrderItems()
        );
    }
}