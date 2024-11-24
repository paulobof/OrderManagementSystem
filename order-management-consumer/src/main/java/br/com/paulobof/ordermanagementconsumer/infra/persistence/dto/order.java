package br.com.paulobof.ordermanagementconsumer.infra.persistence.dto;

import javax.persistence.*;
        import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    private String orderCode;
    private Date orderDate;
    private OrderStatus orderStatus;
    private String clientCode;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    // Getters and Setters
}
