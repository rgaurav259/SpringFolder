package com.user.micro.userservicemicro.service;

import com.user.micro.userservicemicro.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    //fake user  List

    List<User> list= List.of(
            new User(1311L,"gaurav kumar","9006030718"),
            new User(1312L,"Abhishek kumar","90060307"),
            new User(1314L,"ravi kumar","9006030745")
    );


    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }



}
