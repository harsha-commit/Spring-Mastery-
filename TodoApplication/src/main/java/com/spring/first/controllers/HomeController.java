package com.spring.first.controllers;

import com.spring.first.config.HarshaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
//  return value of each method in the class will be serialized directly into the HTTP response body
public class HomeController {

    @Value("${harsha.profile.image.path}")
    // reading data from properties file
    private String profilePath;

    @Autowired
    HarshaConfig harshaConfig;

    @RequestMapping("/todos")
    // mapping URLs to methods
    public List<String> justTest(){
        List<String> todos = Arrays.asList(
                "Learn Java",
                "Learn Spring Boot",
                "Develop Projects",
                "Learn Node.js");
        return todos;
    }

    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return profilePath;
    }

    @RequestMapping("/harsha-config")
    public HarshaConfig getHarshaConfig(){
        System.out.println(harshaConfig);
        return harshaConfig;
    }
}
