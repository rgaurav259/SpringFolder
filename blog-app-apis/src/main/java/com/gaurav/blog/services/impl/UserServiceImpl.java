package com.gaurav.blog.services.impl;

import com.gaurav.blog.entities.User;
import com.gaurav.blog.payloads.UserDto;
import com.gaurav.blog.repositories.UserRepo;
import com.gaurav.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDto createUser(UserDto userDto) {

        User user=this.dtoToUser(userDto);
       User saveduser= this.userRepo.save(user);
        return this.userToDto(saveduser);
    }

    @Override
    public UserDto updateUser(UserDto user, Integer userId) {
        return null;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }


    //convert dtouser to entity
    //convert entity to dtouser
    public User dtoToUser(UserDto userDto){

        User user=new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        user.setPassword(userDto.getPassword());
        return user;

    }

    public UserDto userToDto(User user){
        UserDto userDto=new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setAbout(user.getAbout());
        return userDto;
    }



}
