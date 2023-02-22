package com.spring.withoutboot.config;

import com.spring.withoutboot.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"com.spring.withoutboot", "another.world"})
public class AppConfig {

    // bean for cartService
    @Bean("cartService")
    public CartService cartService(){
        return new CartService();
    }
}
