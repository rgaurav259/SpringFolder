package com.spring.security.SpringSecurityDemo.controller;

import com.spring.security.SpringSecurityDemo.entity.User;
import com.spring.security.SpringSecurityDemo.model.UserModel;
import com.spring.security.SpringSecurityDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;


    @PostMapping( "/register")
    public String registerUser(@RequestBody UserModel userModel){
       User user =userService.registerUser(userModel);
       return "Success";
    }



}
