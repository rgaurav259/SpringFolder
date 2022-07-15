package com.example.data.dtoexample.controller;

import com.example.data.dtoexample.dto.UserLocationDto;
import com.example.data.dtoexample.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllusersLocations")
    public List<UserLocationDto> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }
}
