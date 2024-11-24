package br.com.paulobof.ordermanagementconsumer.interfaces.event;

import org.springframework.stereotype.Component;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@Component
public class OrderEventConsumer {

    @StreamListener(Sink.INPUT)
    public void handleOrderCreatedEvent(OrderCreatedEvent event) {
        // Lógica para processar o evento de pedido criado
    }
}
