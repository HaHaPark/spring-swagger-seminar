package com.example.swaggersemniar.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "swagger seminar API 문서",
                description = "박하 작성",
                version = "v1")
)
public class Swaggerconfig {

    @Bean
    public GroupedOpenApi openApi(){
        String[] paths = {"/**"};

        return GroupedOpenApi.builder()
                .group("Swagger Weminar API v1")
                .pathsToMatch(paths)
                .build();
    }
}
