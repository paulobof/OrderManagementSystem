package br.com.paulobof.ordermanagementproducer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class OrderManagementProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementProducerApplication.class, args);
	}

}
