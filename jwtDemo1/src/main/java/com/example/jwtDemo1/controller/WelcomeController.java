package com.example.jwtDemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class WelcomeController {

    @GetMapping("/")
    public String welcome(){
        return "welcome to gaurav";
    }


}
