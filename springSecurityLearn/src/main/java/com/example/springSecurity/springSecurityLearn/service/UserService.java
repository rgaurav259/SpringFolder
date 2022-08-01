package com.example.springSecurity.springSecurityLearn.service;

import com.example.springSecurity.springSecurityLearn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    ArrayList<User> list= new ArrayList<>();

    public UserService(){
        list.add(new User("xyz","xyz@gmail.com","xyz"));
        list.add(new User("ABC","xyzabc@gmail.com","ABC"));

    }

}
