package com.examp.security.springsecurityjavatechie.controller;

import com.examp.security.springsecurityjavatechie.common.UserConstant;
import com.examp.security.springsecurityjavatechie.entity.User;
import com.examp.security.springsecurityjavatechie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

//    public static final String DEFAULT_ROLE = "ROLE_USER";
//
//    public static final String[] ADMIN_ACCESS = {"ROLE_ADMIN","ROLE_MODERATOR"};
//    public static final String[] MODERATOR_ACCESS = {"ROLE_MODERATOR"};


    @Autowired
    private UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/join")
    public String joinGroup(@RequestBody User user){
        user.setRoles(UserConstant.DEFAULT_ROLE); //by default role user
        String encryptedPwd = passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptedPwd);
        userRepository.save(user);
        return "Hi.." + user.getUserName() + " welcome to group !";

    }
    //if Logged in user is admin he can give 2 access admin or moderator
    //if logged in user is moderator he can only give accces moderator.
//principal give only name is logged in user

    @GetMapping("/access/{userId}/{userRole}")
    //@Secured("ROLE_ADMIN")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MODERATOR')")
    public String giveAccessToUser(@PathVariable int userId, @PathVariable String userRole, Principal principal){

        User user = userRepository.findById(userId).get();
        List<String> activeRoles = getrolesByLoggedInUser(principal);

        String newRole = "";
        if (activeRoles.contains(userRole)){
         newRole = user.getRoles()+","+userRole;
         user.setRoles(newRole);
        }
        userRepository.save(user);
        return "Hi.." + user.getUserName() + " new Role assign to you by !" +principal.getName();

    }

    @GetMapping("/test")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String testUserAccess(){
        return "user can only access this !";
    }

    @GetMapping
    @Secured("ROLE_ADMIN")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<User> loadUsers(){
        return userRepository.findAll();
    }

    private List<String> getrolesByLoggedInUser(Principal principal){
        String roles = gettLoggedInUser(principal).getRoles();
        List<String> assignRoles = Arrays.stream(roles.split(","))
                .collect(Collectors.toList());
        if (assignRoles.contains("ROLE_ADMIN")){
            return Arrays.stream(UserConstant.ADMIN_ACCESS).collect(Collectors.toList());
        }
        if (assignRoles.contains("ROLE_MODERATOR")){
            return Arrays.stream(UserConstant.MODERATOR_ACCESS).collect(Collectors.toList());
        }
        return Collections.emptyList();

    }


    private User gettLoggedInUser(Principal principal){
        return userRepository.findByUserName(principal.getName()).get();
    }

}
