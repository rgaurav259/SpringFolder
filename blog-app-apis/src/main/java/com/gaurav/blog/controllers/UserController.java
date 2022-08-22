package com.gaurav.blog.controllers;

import com.gaurav.blog.payloads.UserDto;
import com.gaurav.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //post-create user
    @PostMapping("/saveUser")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto createduserDto = userService.createUser(userDto);
        return new ResponseEntity<UserDto>(createduserDto, HttpStatus.CREATED);

    }

    //Put- update user
    //Delete delete user4
    //GET -user get









}
