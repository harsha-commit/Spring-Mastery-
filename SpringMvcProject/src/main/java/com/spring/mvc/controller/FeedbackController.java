package com.spring.mvc.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeedbackController {

    //@RequestMapping(value = "/feedbacks", method = RequestMethod.GET)
    @GetMapping("/feedbacks")
    // the new and simpler way
    public List<String> getFeedbacks(){
        return Arrays.asList("Good course", "Very Useful", "Up to date");
    }

    @PostMapping("/feedback")
    public String createFeedback(){
        System.out.println("Creating feedback...");
        return "Feedback Created";
    }
}
