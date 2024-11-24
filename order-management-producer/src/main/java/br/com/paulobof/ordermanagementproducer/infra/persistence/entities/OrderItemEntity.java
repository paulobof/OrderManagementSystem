package br.com.paulobof.ordermanagementproducer.infra.persistence.entities;

import br.com.paulobof.ordermanagementproducer.domain.entities.Order;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orderlist")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderCode;

    private int quantity;

    private Long productCode;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "order_code", nullable = false)
    //private order order;

}