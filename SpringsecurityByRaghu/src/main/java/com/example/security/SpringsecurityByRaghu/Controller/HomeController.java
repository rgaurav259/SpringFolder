package com.example.security.SpringsecurityByRaghu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHome(){
        return "HomePage";
    }

    @GetMapping("/welcome")
    public String showWelcome(){
        return "WelcomePage";
    }

    @GetMapping("/admin")
    public String showAdmin(){
        return "AdminPage";
    }


    @GetMapping("/emp")
    public String showEmp(){
        return "EmployeePage";
    }

    @GetMapping("/std")
    public String showStd(){
        return "StudentPage";
    }

    @GetMapping("/denied")
    public String showDenied(){
        return "DeniedPage";
    }



}
