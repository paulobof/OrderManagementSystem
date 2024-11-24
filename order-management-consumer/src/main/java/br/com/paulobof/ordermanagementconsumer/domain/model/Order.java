package br.com.paulobof.ordermanagementconsumer.domain.model;

import lombok.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Order {

    private String orderCode;
    private Date orderDate;
    private OrderStatus orderStatus;
    private String clientCode;
    private List<OrderItem> orderItems;

}
