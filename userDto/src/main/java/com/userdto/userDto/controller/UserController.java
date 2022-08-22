package com.userdto.userDto.controller;

import com.userdto.userDto.dto.UserLocationDTO;

import com.userdto.userDto.entity.User;
import com.userdto.userDto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserLocationDTO> getAllUsersLocation(User user){
        return userService.getAllUsersLocation(user);
    }

    @PostMapping("/saveUsers")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }


}
