package com.spring.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    @Autowired
    Pet pet;

    public Human(Pet pet){
        this.pet = pet;
    }
    public void playWithPet() {
        pet.play();
    }
}
