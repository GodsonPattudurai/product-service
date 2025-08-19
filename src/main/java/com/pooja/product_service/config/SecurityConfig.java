package com.pooja.product_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
                .headers(headers -> headers
                        .frameOptions(frame -> frame.sameOrigin()))// Disable CSRF for simplicity in development, consider enabling in production
            .authorizeHttpRequests(authorizeRequests ->
                authorizeRequests
                    .requestMatchers("/swagger-ui/**").permitAll() // Allow access to Swagger UI
                        .requestMatchers("/swagger-ui.html").permitAll() // Allow access to Swagger UI
                        .requestMatchers("/product/**").permitAll()
                        .requestMatchers("/h2-console/**").permitAll()
                    .requestMatchers("/v3/api-docs/**").permitAll() // Allow access to OpenAPI documentation
                    .anyRequest().authenticated() // Secure all other endpoints
            );
        return http.build();
    }
}