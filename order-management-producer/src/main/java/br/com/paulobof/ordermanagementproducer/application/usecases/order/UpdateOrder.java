package br.com.paulobof.ordermanagementproducer.application.usecases.order;

import br.com.paulobof.ordermanagementproducer.application.gateway.IOrderRepository;
import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateOrder {

    private final IOrderRepository orderRepository;

    public Order updateOrder(Long orderCode, Order order){
        return orderRepository.updateOrder(orderCode, order);
    }
}
