package com.example.exceptionHandlingShivaLab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping
    public String home(Model model, @RequestParam(required = false) String code){

        if ("400".equals(code)){
            throw new RuntimeException("Bad code");
        }

        model.addAttribute("greeting","hello gaurav");
        return "index";
    }
}
