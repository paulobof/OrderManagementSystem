package br.com.paulobof.ordermanagementproducer.application.usecases.order;

import br.com.paulobof.ordermanagementproducer.application.gateway.IOrderRepository;
import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class GetAllOrder {

    private final IOrderRepository customerRepository;

    public List<Order> getAllOrder() {
        return customerRepository.getAllOrder();
    }

}
