package com.gaurav.blog.services.impl;

import com.gaurav.blog.entities.User;
import com.gaurav.blog.exceptions.ResourceNotFoundException;
import com.gaurav.blog.payloads.UserDto;
import com.gaurav.blog.repositories.UserRepo;
import com.gaurav.blog.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public UserDto createUser(UserDto userDto) {

        User user=this.dtoToUser(userDto);
        User saveduser= this.userRepo.save(user);
        return this.userToDto(saveduser);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {
      User user=  this.userRepo.findById(userId)
              .orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));

      user.setName(userDto.getName());
      user.setEmail(userDto.getEmail());
      user.setPassword(userDto.getPassword());
      user.setAbout(userDto.getAbout());

            User updatedUser = this.userRepo.save(user);
            UserDto userDto1 = this.userToDto(updatedUser);
            return userDto1;

    }

    @Override
    public UserDto getUserById(Integer userId) {

        User user=this.userRepo.findById(userId)
                .orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
        return this.userToDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {

        List<User> users = this.userRepo.findAll();
        List<UserDto> userDtos = users.stream()
                .map(user -> this.userToDto(user))
                .collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public void deleteUser(Integer userId) {
        User user = this.userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "Id", userId));
                this.userRepo.delete(user);
    }


    //convert dtouser to entity
    //convert entity to dtouser
    public User dtoToUser(UserDto userDto){

//        User user=new User();
//        user.setId(userDto.getId());
//        user.setName(userDto.getName());
//        user.setEmail(userDto.getEmail());
//        user.setAbout(userDto.getAbout());
//        user.setPassword(userDto.getPassword());
//        return user;

        //using modelMapper

        User user = this.modelMapper.map(userDto,User.class);//userdto ko userclass mai convert
        return user;

    }

    public UserDto userToDto(User user){
//        UserDto userDto=new UserDto();
//        userDto.setId(user.getId());
//        userDto.setName(user.getName());
//        userDto.setEmail(user.getEmail());
//        userDto.setPassword(user.getPassword());
//        userDto.setAbout(user.getAbout());
//        return userDto;

        //uisng model mapper

        UserDto userDto = this.modelMapper.map(user,UserDto.class);
        return userDto;
    }



}
