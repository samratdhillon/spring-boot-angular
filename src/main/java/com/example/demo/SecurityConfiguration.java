package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityWebFilterChain webFluxFormSecurityChain(ServerHttpSecurity http) {
        http.authorizeExchange().anyExchange().authenticated().and().httpBasic().and().formLogin();
        return http.build();

    }

}
