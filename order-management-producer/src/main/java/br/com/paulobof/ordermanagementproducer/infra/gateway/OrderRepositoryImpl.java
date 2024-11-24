package br.com.paulobof.ordermanagementproducer.infra.gateway;

import br.com.paulobof.ordermanagementproducer.application.gateway.IOrderRepository;
import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import br.com.paulobof.ordermanagementproducer.infra.mapper.OrderMapper;
import br.com.paulobof.ordermanagementproducer.infra.persistence.entities.OrderEntity;
import br.com.paulobof.ordermanagementproducer.infra.persistence.repository.OrderRepository;
import br.com.paulobof.ordermanagementproducer.interfaces.controller.mapper.OrderMapperDto;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class OrderRepositoryImpl implements IOrderRepository {
    
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final OrderMapperDto orderMapperDto;
    
    public Order createOrder(Order order) {
        OrderEntity orderEntity = orderMapper.toEntity(order);
        return orderMapper.toOrder( orderRepository.save(orderEntity));
    }

    public Order getByOrderCode(Long orderCode) {
        OrderEntity orderEntity = orderRepository.findById(orderCode)
                .orElseThrow( () -> new EntityNotFoundException("Order not found"));
        return orderMapper.toOrder(orderEntity);
    }

    public List<Order> getAllOrder() {
        List<OrderEntity> orders  = orderRepository.findAll();
        return orders.stream()
                .map(orderMapper::toOrder)
                .collect(Collectors.toList());
    }

    public Order updateOrder(Long orderCode, Order order) {
        OrderEntity orderEntity = orderMapper.toEntity(order);
        orderEntity.setOrderCode(orderCode);
        OrderEntity updatedEntity = orderRepository.save(orderEntity);
        return orderMapper.toOrder(updatedEntity);
    }

    public void deleteOrder(Long orderCode) {
        orderRepository.deleteById(orderCode);
    }

    public  Boolean existsOrder(Long orderCode) {
        return orderRepository.existsById(orderCode);
    }

}