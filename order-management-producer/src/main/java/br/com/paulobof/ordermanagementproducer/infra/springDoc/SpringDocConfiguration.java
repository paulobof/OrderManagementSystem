package br.com.paulobof.ordermanagementproducer.infra.springDoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

    String desc = "# API de Gerenciamento de Cliente\n" +
            "\n" +
            "TODO";

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                )
                .info(new Info()
                        .title("Prder Management Producer API")
                        .description(desc)
                        .contact(new Contact()
                                .name("Time backend")
                                .email("paulobof@gmail.com"))
                        .license(new License()
                                .name("Apache 2.0")
                        )
                );
    }
}
