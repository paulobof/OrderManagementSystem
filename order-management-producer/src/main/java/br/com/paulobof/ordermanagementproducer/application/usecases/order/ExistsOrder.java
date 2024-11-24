package br.com.paulobof.ordermanagementproducer.application.usecases.order;

import br.com.paulobof.ordermanagementproducer.application.gateway.IOrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExistsOrder {

    private final IOrderRepository customerRepository;

    public boolean existsOrder(Long customerCode){
        return customerRepository.existsOrder(customerCode);
    }

}
