package com.spring.book.spring.rest.controller;

import com.spring.book.spring.rest.entities.Course;
import com.spring.book.spring.rest.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {


   @Autowired
    private courseService courseService1;


    @GetMapping("/home")
    public String home(){
        return "welcome home";
    }


    //get the courses

    @GetMapping("/courses")
    public List<Course> getCourses(){
    return this.courseService1.getCourses();
    }
}
