package com.example.practicalemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class PracticalEmployeeApplication {

    public static void main (String[] args) {
        SpringApplication.run (PracticalEmployeeApplication.class, args);
    }
    @Bean
    public Docket docket()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("trungfpt.practicaltest"))
                .paths(PathSelectors.any())
                .build();
    }
}
