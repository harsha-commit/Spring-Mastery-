package com.spring.core.config;

import com.spring.core.couple.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {
    // we can use a separate class with @Configuration
    // @SpringBootApplication has @Configuration, so we can use in main class also
    @Bean(name = "samosa1")
    @Primary
    public Samosa getSamosa(){
        return new Samosa("Tandoori Samosa");
    }

    @Bean(name = "samosa2")
    public Samosa getSamosa2(){
        return new Samosa("Meetha Samosa");
    }
}
