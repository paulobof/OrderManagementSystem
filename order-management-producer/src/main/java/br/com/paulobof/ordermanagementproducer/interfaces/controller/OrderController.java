package br.com.paulobof.ordermanagementproducer.interfaces.controller;

import br.com.paulobof.ordermanagementproducer.application.usecases.order.*;
import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import br.com.paulobof.ordermanagementproducer.interfaces.controller.mapper.OrderMapperDto;
import br.com.paulobof.ordermanagementproducer.interfaces.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final CreateOrder createOrderUseCase;
    private final GetByOrderCode getByOrderCodeUseCase;
    private final GetAllOrder getAllOrderUseCase;
    private final UpdateOrder updateOrderUseCase;
    private final DeleteOrder deleteOrderUseCase;
    private final OrderMapperDto orderMapperDto;
    /*
    private final ExistsOrder existsOrderUseCase;*/

    @PostMapping
    public ResponseEntity<OrderDto> createOrder (
            @RequestBody OrderDto orderDto) {

        Order orderSalvar= orderMapperDto.toOrder(orderDto);

        Order order = createOrderUseCase.createOrder(orderSalvar);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new OrderDto(order.getOrderCode(), order.getOrderDate(), order.getOrderStatus(), order.getClientCode(), order.getOrderItems()));
    }

    @GetMapping("/{orderCode}")
    public ResponseEntity<OrderDto> getByOrderCode (
            @PathVariable Long orderCode) {

        Order order = getByOrderCodeUseCase.getByOrderCode(orderCode);
        OrderDto  orderDto = OrderMapperDto.toOrderDto(order);

        return ResponseEntity.status(HttpStatus.OK).body(orderDto);
    }

    @GetMapping
    public ResponseEntity<List<OrderDto>> getAllOrder() {

        List<Order> orders = getAllOrderUseCase.getAllOrder();
        List<OrderDto> orderDtos = orders.stream()
                .map(OrderMapperDto::toOrderDto)
                .collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(orderDtos);
    }

    @PutMapping("/{orderCode}")
    public ResponseEntity<OrderDto> updateOrder(
            @PathVariable Long orderCode,
            @RequestBody Order order) {

        Order updatedOrder = updateOrderUseCase.updateOrder(orderCode, order);
        OrderDto updatedOrderDto = OrderMapperDto.toOrderDto(updatedOrder);

        return ResponseEntity.status(HttpStatus.OK).body(updatedOrderDto);
    }

    @DeleteMapping("/{orderCode}")
    public ResponseEntity<String> deleteOrder(
            @PathVariable Long orderCode) {

        deleteOrderUseCase.deleteOrder(orderCode);

        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
