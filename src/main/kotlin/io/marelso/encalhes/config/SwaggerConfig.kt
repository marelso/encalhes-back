package io.marelso.encalhes.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {
    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("ZH Encalhes")
                    .version("v1.0")
                    .description("Essa é uma documentação para as chamadas disponíveis para a funcionalidade de controle de encalhes da ZH.")
                    .termsOfService("https://example.com/terms")
                    .contact(
                        Contact()
                            .name("Contato")
                            .url("https://example.com/support")
                            .email("support@example.com")
                    )
            )
    }

    @Bean
    fun publicApi(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("Encalhes v1.0")
            .pathsToMatch("/**")
            .build()
    }
}