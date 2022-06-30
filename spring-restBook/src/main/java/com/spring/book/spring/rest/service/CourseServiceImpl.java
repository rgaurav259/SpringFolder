package com.spring.book.spring.rest.service;

import com.spring.book.spring.rest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements courseService{
//---------------instead of data

    List<Course> list;

    public CourseServiceImpl(){
        list= new ArrayList<>();
        list.add(new Course(145,"java","this course,java"));
        list.add(new Course(545,"springboot","creating course"));

    }
    //---------------


    @Override
    public List<Course> getCourses() {
        return list;
    }



}
