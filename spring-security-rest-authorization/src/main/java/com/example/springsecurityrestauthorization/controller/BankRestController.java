package com.example.springsecurityrestauthorization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @GetMapping("/home")
    public String home(){
        String  msg ="welcome to the spring world security Bank ";
        return msg;
    }

    @GetMapping("/balance")
    public String getBalance(){
        String  msg = "your current balance is : 4578 INR";
        return msg;
    }

    @GetMapping("/statement")
    public String getStmt(){
        String  msg = "your statement Generated and sent to your email id";
        return msg;
    }
    @GetMapping("/myloan")
    public String getMyLoan(){
        String  msg = "your loan amount is 4500000";
        return msg;
    }
    @GetMapping("/contact")
    public String contact(){
        String  msg = "thank you for contacting ";
        return msg;
    }


}

//by default login user passswod generated