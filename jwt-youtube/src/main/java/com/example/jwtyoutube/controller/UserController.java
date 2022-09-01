package com.example.jwtyoutube.controller;

import com.example.jwtyoutube.entity.User;
import com.example.jwtyoutube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


//    @PostConstruct
//    public void initRolesAndUsers(){
//        userService.initRolesAndUser();
//    }


    @PostMapping({"/registerNewUser"})
    public User  registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user);

    }

}
