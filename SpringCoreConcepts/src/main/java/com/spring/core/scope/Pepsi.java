package com.spring.core.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Pepsi {

    @Autowired
    private Soda soda;

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    public Pepsi(){
        System.out.println("Pepsi Created 🤖");
    }

    public void drink(){
        System.out.println("Pepsi is the best 🍾");
    }
}
