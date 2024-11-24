package br.com.paulobof.ordermanagementproducer.application.usecases.order;

import br.com.paulobof.ordermanagementproducer.application.gateway.IOrderRepository;
import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetByOrderCode {

    private final IOrderRepository customerRepository;

    public Order getByOrderCode(Long customerCode){
        return customerRepository.getByOrderCode(customerCode);
    }
}
