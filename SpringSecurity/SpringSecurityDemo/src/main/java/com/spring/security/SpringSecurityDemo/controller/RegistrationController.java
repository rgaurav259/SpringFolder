package com.spring.security.SpringSecurityDemo.controller;

import com.spring.security.SpringSecurityDemo.entity.User;
import com.spring.security.SpringSecurityDemo.entity.VerificationToken;
import com.spring.security.SpringSecurityDemo.event.RegistrationCompleteEvent;
import com.spring.security.SpringSecurityDemo.model.PasswordModel;
import com.spring.security.SpringSecurityDemo.model.UserModel;
import com.spring.security.SpringSecurityDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@Slf4j
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
    public String resendVerificationToken(@RequestParam("token") String oldToken,
                                    HttpServletRequest request){//httpservlet geneates url again
        VerificationToken verificationToken =
                userService.generateNewVerificationToken(oldToken);

        User user = verificationToken.getUser();
        resendVerificationTokenMail(user,applicationUrl(request),verificationToken);
        return "Verification Link send again..";

    }


    //reset password..
    @PostMapping("/resetPassword")
    public String resetPassword(@RequestBody PasswordModel passwordModel,HttpServletRequest request){

        User user = userService.findUserByEmail(passwordModel.getEmail());

        String url = "";

        if (user != null){
            String token = UUID.randomUUID().toString();
            userService.createPasswordResetTokenForUser(user,token);
            url = passwordResetTokenMail(user,applicationUrl(request),token);
        }

        return url;
    }

    @PostMapping("/savePassword")
    public String savePassword(@RequestParam("token") String token,
                               @RequestBody PasswordModel passwordModel){

        String result = userService.validatePasswordResetToken(token);

    }

    private String passwordResetTokenMail(User user, String applicationUrl, String token) {

        String url = applicationUrl
                +"/savePassword?token="+token;

        //sendReset Paaseord
        log.info("click the link to Reset your Password: {}",url);

    }


    private void resendVerificationTokenMail(User user, String applicationUrl,VerificationToken verificationToken) {

        String url = applicationUrl
                +"/verifyRegistration?token="+verificationToken.getToken();

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
