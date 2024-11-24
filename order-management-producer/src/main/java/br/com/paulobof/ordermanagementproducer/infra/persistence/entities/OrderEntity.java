package br.com.paulobof.ordermanagementproducer.infra.persistence.entities;

import br.com.paulobof.ordermanagementproducer.domain.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "order")
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderCode;

    private Date orderDate;

    private int orderStatus;

    private Long clientCode;

    //@OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL)
    private Long orderItems;

}
