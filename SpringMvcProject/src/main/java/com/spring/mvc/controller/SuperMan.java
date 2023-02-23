package com.spring.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Not using @RestController, so need to send correct response
// or can use @Component and @RequestMapping
public class SuperMan {
    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Processing about request 🔃");
        // takes from templates with name "about.html"
        // no need of ViewResolver
        return "about";
    }

    @RequestMapping("/services")
    public String serviceRequestHandler(){
        System.out.println("Processing service request 🔃");
        return "services";
    }
}
