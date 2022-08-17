package com.example.validationhibernatejavatechie.service;


import com.example.validationhibernatejavatechie.dto.UserRequest;
import com.example.validationhibernatejavatechie.entity.User;
import com.example.validationhibernatejavatechie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(UserRequest userRequest){
        User user = User.build(
                0, userRequest.getName(), userRequest.getEmail(),userRequest.getMobile(),
                userRequest.getGender()
                ,userRequest.getAge()
                ,userRequest.getNationality());

        return userRepository.save(user);

    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findByUserId(id);
    }


}
