package br.com.mslogistica.ms_logistica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsLogisticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLogisticaApplication.class, args);
	}

}
