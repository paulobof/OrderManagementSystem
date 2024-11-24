package br.com.paulobof.ordermanagementproducer.application.usecases.order;

import br.com.paulobof.ordermanagementproducer.application.gateway.IOrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteOrder {

    private final IOrderRepository customerRepository;

    public void deleteOrder(Long customerCode){
        customerRepository.deleteOrder(customerCode);
    }
}
