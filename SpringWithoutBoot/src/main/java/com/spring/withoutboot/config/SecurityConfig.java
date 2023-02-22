package com.spring.withoutboot.config;

import com.spring.withoutboot.web.AuthController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    // Bean for AuthController
    @Bean
    public AuthController authController(){
        return new AuthController();
    }
}
