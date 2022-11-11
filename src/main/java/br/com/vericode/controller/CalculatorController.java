package br.com.vericode.controller;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import br.com.vericode.service.CalculatorService;

@Configuration
public class CalculatorController {
    @Bean
    public RouterFunction<ServerResponse> calculator(CalculatorService service) {
        return RouterFunctions.route(POST("/sum"), service::sum)
                .andRoute(POST("/divide"), service::divide);
    }
}
