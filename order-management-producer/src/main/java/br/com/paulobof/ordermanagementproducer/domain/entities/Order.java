package br.com.paulobof.ordermanagementproducer.domain.entities;

import br.com.paulobof.ordermanagementproducer.domain.enums.OrderStatus;
import lombok.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {
    private Long orderCode;
    private Date orderDate;
    private int  orderStatus;
    private Long clientCode;
    private Long orderItems;

    public Order(
            Long orderCode,
            Date orderDate,
            int orderStatus,
            Long clientCode,
            Long orderItems) {
    }
    public Order(
            Date orderDate,
            int orderStatus,
            Long clientCode,
            Long orderItems) {
    }

}