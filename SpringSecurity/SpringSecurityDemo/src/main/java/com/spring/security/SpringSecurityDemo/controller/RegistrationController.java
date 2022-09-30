package com.spring.security.SpringSecurityDemo.controller;

import com.spring.security.SpringSecurityDemo.entity.User;
import com.spring.security.SpringSecurityDemo.event.RegistrationCompleteEvent;
import com.spring.security.SpringSecurityDemo.model.UserModel;
import com.spring.security.SpringSecurityDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationEventPublisher publisher;


    @PostMapping( "/register")
    public String registerUser(@RequestBody UserModel userModel ,
                               final HttpServletRequest request){
       User user = userService.registerUser(userModel);
       publisher.publishEvent(new RegistrationCompleteEvent(
               user,
               applicationUrl(request)
       ));

       return "Success";
    }

    //verify user registration link
    @GetMapping("/verifyRegistration")
    public String verifyRegistration(@RequestParam("token") String token){
       String result = userService.validateVerificationToken(token);
        if (result.equalsIgnoreCase("valid")){
            return "user verified successfully";
        }
        return "Bad User";
    }


    private String applicationUrl(HttpServletRequest request) {
        return "http://"+
                request.getServerName() +
                ":" +
                request.getServerPort()+
                request.getContextPath();
    }


}
