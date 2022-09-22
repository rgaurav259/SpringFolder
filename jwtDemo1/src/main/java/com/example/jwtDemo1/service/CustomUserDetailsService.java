package com.example.jwtDemo1.service;

import com.example.jwtDemo1.entity.User;
import com.example.jwtDemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User byUserName = repository.findByUserName(username);

        return new org.springframework.security.core.userdetails.User(byUserName.getUserName(),
                byUserName.getPassword(),new ArrayList<>());
    }
}
