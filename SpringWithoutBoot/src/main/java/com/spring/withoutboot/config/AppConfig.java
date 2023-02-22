package com.spring.withoutboot.config;

import com.spring.withoutboot.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // bean for cartService
    @Bean("cartService")
    public CartService cartService(){
        return new CartService();
    }
}
