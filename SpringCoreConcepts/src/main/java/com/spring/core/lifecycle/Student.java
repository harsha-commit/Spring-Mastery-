package com.spring.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("student2")
public class Student{
    public Student(){
        System.out.println("Student Created 👨‍💻");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Student bean is created: @PostConstruct 🚴");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Student is about to leave: @PreDestroy 🚲");
    }
}
