package com.spring.security.SpringSecurityDemo.controller;

import com.spring.security.SpringSecurityDemo.entity.User;
import com.spring.security.SpringSecurityDemo.entity.VerificationToken;
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


    @PostMapping("/register")
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


    @GetMapping("/resendVerifyToken")
    public String resendVerifyToken(@RequestParam("token") String oldToken,
                                    HttpServletRequest request){
        VerificationToken verificationToken =
                userService.generateNewVerificationToken(oldToken);

        User user = verificationToken.getUser();
        resendVerificationTokenMail(user,applicationUrl(request));
        return "Verification Link send..";

    }

    private void resendVerificationTokenMail(User user, String applicationUrl) {

        String url = applicationUrl
                +"verifyRegistration?token="+token;

        //sendverificationEmail
        log.info("click the link to verify your account: {}",url);

    }

    private String applicationUrl(HttpServletRequest request) {
        return "http://"+
                request.getServerName() +
                ":" +
                request.getServerPort()+
                request.getContextPath();
    }


}
