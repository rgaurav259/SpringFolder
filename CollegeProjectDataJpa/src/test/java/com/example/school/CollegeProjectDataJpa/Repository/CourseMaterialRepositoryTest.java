package com.example.school.CollegeProjectDataJpa.Repository;

import com.example.school.CollegeProjectDataJpa.entity.Course;
import com.example.school.CollegeProjectDataJpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void saveourseMaterial(){
        Course course = Course.builder().title(".net").credit(6).build();
        CourseMaterial courseMaterial = CourseMaterial
                .builder()
                .url("www.facebook.com")
                .course(course)
                .build();

        repository.save(courseMaterial);
    }

    //fetch all coursematerial

    @Test
    public void printAllcourseMaterial(){
        List<CourseMaterial> materialList = repository.findAll();
        System.out.println("materialList = " + materialList);
    }






}