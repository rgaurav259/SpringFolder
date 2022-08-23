package com.gaurav.blog.controllers;

import com.gaurav.blog.payloads.ApiResponse;
import com.gaurav.blog.payloads.UserDto;
import com.gaurav.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){
        UserDto createduserDto = userService.createUser(userDto);
        return new ResponseEntity<>(createduserDto, HttpStatus.CREATED);

    }
    //Put- update user

    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,
                                              @PathVariable("userId") Integer userId){

        UserDto updatedUser = this.userService.updateUser(userDto, userId);
        return ResponseEntity.ok(updatedUser);
    }
    //Delete delete user

    @DeleteMapping("deleteUser/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer userId){

        this.userService.deleteUser(userId);
//        return new ResponseEntity(Map.of("message","user deleted.. successfully"),HttpStatus.OK);
        return new ResponseEntity<ApiResponse>(new ApiResponse("user deleted...",true),HttpStatus.OK);

    }

    //GET -user get
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(this.userService.getAllUsers());
    }


    @GetMapping("/getSingleUsers/{userId}")
    public ResponseEntity<UserDto> getSingleUsers(@PathVariable("userId") Integer userId){
        return ResponseEntity.ok(this.userService.getUserById(userId));
    }








}
