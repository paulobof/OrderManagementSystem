package br.com.paulobof.ordermanagementproducer.infra.config;

import br.com.paulobof.ordermanagementproducer.application.gateway.IOrderRepository;
import br.com.paulobof.ordermanagementproducer.application.usecases.order.*;
import br.com.paulobof.ordermanagementproducer.infra.mapper.OrderMapper;
import br.com.paulobof.ordermanagementproducer.infra.gateway.OrderRepositoryImpl;
import br.com.paulobof.ordermanagementproducer.infra.persistence.repository.OrderRepository;
import br.com.paulobof.ordermanagementproducer.interfaces.controller.mapper.OrderMapperDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "br.com.paulobof.ordermanagementproducer.infra.persistence.repository")
public class OrderConfig {

    @Bean
    CreateOrder createOrder(IOrderRepository orderRepository) {
        return new CreateOrder(orderRepository);
    }


    @Bean
    GetByOrderCode getOrderById(IOrderRepository orderRepository) {
        return new GetByOrderCode(orderRepository);
    }

    @Bean
    GetAllOrder getAllOrder(IOrderRepository orderRepository) {
        return new GetAllOrder(orderRepository);
    }

    @Bean
    UpdateOrder updateOrder(IOrderRepository orderRepository) {
        return new UpdateOrder(orderRepository);
    }
    @Bean
    DeleteOrder deleteOrder(IOrderRepository orderRepository) {
        return new DeleteOrder(orderRepository);
    }

    @Bean
    OrderRepositoryImpl customOrderRepositoryImpl (OrderRepository orderRepository, OrderMapper orderEntityMapper, OrderMapperDto orderMapperDto) {
        return new OrderRepositoryImpl(orderRepository, orderEntityMapper, orderMapperDto);
    }

    @Bean
    OrderMapper orderMapper() {
        return new OrderMapper();
    }
    @Bean
    public OrderMapperDto orderMapperDto() {
        return new OrderMapperDto();
    }

}

