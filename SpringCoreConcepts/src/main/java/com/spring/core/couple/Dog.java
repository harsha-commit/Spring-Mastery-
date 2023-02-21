package com.spring.core.couple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Pet{
    @Override
    public void play() {
        System.out.println("Playing with the Dog 🐶");
    }
}
