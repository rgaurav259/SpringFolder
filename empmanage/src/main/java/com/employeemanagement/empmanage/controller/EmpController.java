package com.employeemanagement.empmanage.controller;

import com.employeemanagement.empmanage.entity.Employee;
import com.employeemanagement.empmanage.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/")
    public String home(){
        return "index";

    }

    @GetMapping("/addemp")
    public String addEmpForm(){

        return "add_emp";
    }
    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee employee, HttpSession session){
        empService.addEmp(employee);
        System.out.println(employee);
        session.setAttribute("msg","employee addedd successfully");
        return "redirect:/";
    }

}
