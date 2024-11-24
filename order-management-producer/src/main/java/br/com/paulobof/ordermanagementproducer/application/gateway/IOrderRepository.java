package br.com.paulobof.ordermanagementproducer.application.gateway;

import br.com.paulobof.ordermanagementproducer.domain.entities.Order;

import java.util.List;

public interface IOrderRepository {

    Order createOrder(Order order);

    List<Order> getAllOrder();

    Order getByOrderCode(Long orderCode);

    Order updateOrder(Long orderCode, Order orderEntity);

    void deleteOrder(Long orderCode);

    Boolean existsOrder(Long orderCode);
}

