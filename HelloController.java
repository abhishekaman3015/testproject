package com.example.testproject.testproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hiiiii";
    }

    @GetMapping("/home")
    public String home() {
        return "hiiiii Abhishek";
    }
     
}
