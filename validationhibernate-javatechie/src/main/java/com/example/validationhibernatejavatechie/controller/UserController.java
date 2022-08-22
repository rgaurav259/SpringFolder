package com.example.validationhibernatejavatechie.controller;

import com.example.validationhibernatejavatechie.dto.UserRequest;
import com.example.validationhibernatejavatechie.entity.User;
import com.example.validationhibernatejavatechie.exception.UserNotFoundException;
import com.example.validationhibernatejavatechie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/userslist")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);

    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) throws UserNotFoundException {
        return new ResponseEntity<>(userService.getUser(id),HttpStatus.FOUND);
    }


    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<User> findUserByName(@PathVariable String name) throws UserNotFoundException {
        return new ResponseEntity<>(userService.findByName(name),HttpStatus.OK);
    }


}