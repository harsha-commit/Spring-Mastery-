package com.spring.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("human")
public class Human {
    @Autowired
    Pet pet;
    @Autowired
    Student student;
    @Autowired
    Samosa samosa;

    public void playWithPet() {
        pet.play();
        student.details();
        samosa.eat();
    }
}
