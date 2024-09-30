package com.aksoyakin.shoppingcart.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Shopping-Cart API")
                        .version("1.0")
                        .description("""
                                Shopping-Cart is a comprehensive ecommerce application.
                                """
                        ));
    }
}