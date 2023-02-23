package com.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
// Not using @RestController, so need to send correct response
//
public class SuperMan {
    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Processing about request 🔃");
        // takes from templates
        return "about";
    }
}
