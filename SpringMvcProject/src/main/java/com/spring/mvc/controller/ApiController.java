package com.spring.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    // tells that return value is not a view
    // change to HttpResponse
    public String helloApi(){
        return "Hello, how are you?";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    // instead of this we can use @RestController
    public List<String> getUserData(){
        return Arrays.asList("Ram", "Shyam", "Chinku");
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public String createUser(){
        System.out.println("Creating User...");
        return "User Created";
    }
}
