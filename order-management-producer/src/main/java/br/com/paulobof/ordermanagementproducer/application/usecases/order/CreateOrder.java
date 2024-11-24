package br.com.paulobof.ordermanagementproducer.application.usecases.order;

import br.com.paulobof.ordermanagementproducer.application.gateway.IOrderRepository;
import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateOrder {

    private final IOrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.createOrder(order);
    }
}
