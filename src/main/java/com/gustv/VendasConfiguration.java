package com.gustv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VendasConfiguration {
    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistemas de Vendas";
    }
}
