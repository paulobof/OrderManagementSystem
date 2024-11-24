package br.com.paulobof.ordermanagementproducer.domain.entities;

import br.com.paulobof.ordermanagementproducer.infra.persistence.entities.OrderEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderItem {

        private Long orderCode;
        private int quantity;
        private Long productCode;
        private Order order;

        public OrderItem(Long orderCode, int quantity,Long productCode, Order order) {
                this.orderCode = orderCode;
                this.quantity = quantity;
                this.productCode = productCode;
                this.order = order;
        }

        public OrderItem(int quantity,Long productCode, Order order) {
                this.quantity = quantity;
                this.productCode = productCode;
                this.order = order;
        }

}
