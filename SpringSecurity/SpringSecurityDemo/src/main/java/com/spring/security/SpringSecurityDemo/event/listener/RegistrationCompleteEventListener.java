package com.spring.security.SpringSecurityDemo.event.listener;

import com.spring.security.SpringSecurityDemo.entity.User;
import com.spring.security.SpringSecurityDemo.event.RegistrationCompleteEvent;
import com.spring.security.SpringSecurityDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;
@Component
@Slf4j
public class RegistrationCompleteEventListener implements
        ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;


    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {

        //create the verification Token for the user with link

        User user =event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token,user);
        //send mail to user

        String url = event.getApplicationUrl() +"/verifyRegistration?token="+token;

        //sendverificationEmail
        log.info("click the link to verify your account: {}",url);

    }
}
