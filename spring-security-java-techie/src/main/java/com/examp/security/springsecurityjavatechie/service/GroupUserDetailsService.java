package com.examp.security.springsecurityjavatechie.service;

import com.examp.security.springsecurityjavatechie.entity.User;
import com.examp.security.springsecurityjavatechie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupUserDetailsService implements UserDetailsService {
   @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(username);


        return user.map(GroupUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException(username+"doesn't exist"));

    }
}
