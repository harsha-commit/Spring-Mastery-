package com.spring.core.couple;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Pet{
    @Override
    public void play() {
        System.out.println("Playing with the Cat 🐱");
    }
}
