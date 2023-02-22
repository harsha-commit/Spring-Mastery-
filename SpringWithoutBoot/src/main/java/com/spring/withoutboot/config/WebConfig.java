package com.spring.withoutboot.config;

import com.spring.withoutboot.web.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    // Bean for HomeController
    @Bean
    public HomeController homeController(){
        return new HomeController();
    }
}
