package com.example.jwtyoutube.controller;

import com.example.jwtyoutube.entity.User;
import com.example.jwtyoutube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//it will save data in database by default because post construct
    @PostConstruct
    public void initRolesAndUsers(){
        userService.initRolesAndUser();
    }


    @PostMapping({"/registerNewUser"})
    public User  registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasAnyRole('User','Admin')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }

}
