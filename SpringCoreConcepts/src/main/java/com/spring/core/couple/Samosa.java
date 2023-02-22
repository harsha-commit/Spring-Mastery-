package com.spring.core.couple;

import org.springframework.context.annotation.Bean;

public class Samosa {

    public String name;
    public Samosa(String name){
        this.name = name;
        System.out.println("This is " + name + " 😋");
    }
    public void eat(){
        System.out.println(name + " is delicious ❤️");
    }
}
