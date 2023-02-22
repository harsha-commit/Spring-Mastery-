package com.spring.withoutboot.beans;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void createOrder(){
        System.out.println("Order is placed successfully 📦");
    }
}
