package com.example.jwtyoutube.controller;

import com.example.jwtyoutube.entity.User;
import com.example.jwtyoutube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//it will save data in database
    @PostConstruct
    public void initRolesAndUsers(){
        userService.initRolesAndUser();
    }


    @PostMapping({"/registerNewUser"})
    public User  registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    private String forAdmin(){
        return "this url is only accessible for admin";
    }

    @GetMapping({"/forUser"})
    private String forUser(){
        return "this url is only accessible for forUser";
    }

}
