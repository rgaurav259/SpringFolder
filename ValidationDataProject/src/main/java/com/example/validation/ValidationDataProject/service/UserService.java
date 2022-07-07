package com.example.validation.ValidationDataProject.service;

import com.example.validation.ValidationDataProject.dto.UserRequest;
import com.example.validation.ValidationDataProject.entity.User;
import com.example.validation.ValidationDataProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public User saveUser(UserRequest userRequest){
        User user=User.build(0, userRequest.getName(), userRequest.getEmail(),
                userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());

    return userRepository.save(user);
    }


    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    public User getUser(int id){
        return userRepository.findByUserId(id);
    }

}
