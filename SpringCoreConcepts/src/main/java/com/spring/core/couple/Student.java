package com.spring.core.couple;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(){
        System.out.println("Student created 🤖");
    }

    public void details(){
        System.out.println("Student details...");
    }
}
