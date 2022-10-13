package com.gaurav.jjwtByR.Service;

import com.gaurav.jjwtByR.Model.User;
import com.gaurav.jjwtByR.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService , UserDetailsService {

    @Autowired
    private UserRepository repo; //Has-a

    @Autowired
    private BCryptPasswordEncoder pwdEncoder;


    //save method
    @Override
    public Integer saveUser(User user) {
        //TODO: Encode password now done
       user.setPassword(pwdEncoder.encode(user.getPassword()));
        return repo.save(user).getId();

    }

    //get USer by username

    @Override
    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }


    //UserDetailsservice interface provided by spring scurity  this will load username from db
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> opt = findByUsername(username);
        if (opt.isEmpty())
            throw  new UsernameNotFoundException("user name not found....");

        //read user from db     password ke liye object creation
        User user = opt.get();

        //this time i have to return spring security object not mine classess objects
        //authorities ke liye simple granted authority because User method will have to 3 parameters.
        return new org.springframework.
                security.core.userdetails.User(
                        username,
                        user.getPassword(),
                        user.getRoles().stream().map(role->new SimpleGrantedAuthority(role))
                                .collect(Collectors.toList()) );
    }
}
