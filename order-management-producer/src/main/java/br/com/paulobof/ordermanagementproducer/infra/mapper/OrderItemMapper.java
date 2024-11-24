package br.com.paulobof.ordermanagementproducer.infra.mapper;

import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import br.com.paulobof.ordermanagementproducer.domain.entities.OrderItem;
import br.com.paulobof.ordermanagementproducer.infra.persistence.entities.OrderItemEntity;

public class OrderItemMapper {
    /*public OrderItemEntity toEntity(OrderItem orderItem) {
        return new OrderItemEntity(
                orderItem.getOrderCode(),
                orderItem.getQuantity(),
                orderItem.getProductCode(),
                orderItem.getOrder()
        );
    }

    public OrderItem toEntityDomain(OrderItemEntity orderItemEntity) {
        return new OrderItem(
                orderItemEntity.getOrderCode(),
                orderItemEntity.getQuantity(),
                orderItemEntity.getProductCode(),
                orderItemEntity.getOrder()
        );
    }*/
}
