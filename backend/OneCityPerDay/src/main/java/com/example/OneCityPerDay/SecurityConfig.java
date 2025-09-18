package com.example.OneCityPerDay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .securityMatcher("/**")         // applique à tous les endpoints
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()) // autorise tout
                .formLogin(form -> form.disable())   // désactive le login
                .httpBasic(httpBasic -> httpBasic.disable()) // désactive HTTP Basic
                .csrf(csrf -> csrf.disable());        // désactive CSRF

        return http.build();
    }
}
