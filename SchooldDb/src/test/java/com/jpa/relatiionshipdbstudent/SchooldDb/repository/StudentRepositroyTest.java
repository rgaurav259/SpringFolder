package com.jpa.relatiionshipdbstudent.SchooldDb.repository;

import com.jpa.relatiionshipdbstudent.SchooldDb.entity.Guardian;
import com.jpa.relatiionshipdbstudent.SchooldDb.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositroyTest {

    @Autowired
    private StudentRepositroy studentRepositroy;
    @Test
    public void saveStudent(){

        Student student=Student.builder()
                .emailId("gaurav@gmail.com")
                .firstName("gaurav")
                .lastName("kumar")
                //.guardianName("navin")
                //.guardianEmail("navin@gmail.com")
                //.guardianMobile("9999988888")
                .build();
        studentRepositroy.save(student);

    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian= Guardian.builder()
                .email("navin@gmail.com")
                .mobile("98989885555")
                .name("navin")

                .build();

    Student student=Student.builder()
            .firstName("saurabh")
            .lastName("kumar")
            .emailId("saurabh@gmail.com")
            .guardian(guardian)
            .build();

    studentRepositroy.save(student);
    }




    @Test
    public void printAllStudent(){
        List<Student> studentList=studentRepositroy.findAll();

        System.out.println("studentList = " + studentList);
    }



    @Test
    public void printStudentByFirstName(){
        List<Student> students= studentRepositroy.findByFirstName("Saurabh");


        System.out.println("students = " + students);
    }


    @Test
    public void printStudentByFirstNameContainig(){
        List<Student> students= studentRepositroy.findByFirstNameContaining("g");


        System.out.println("students = " + students);
    }


    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> studentList=studentRepositroy.findByGuardianName("navin");

        System.out.println("studentList = " + studentList);
    }


    @Test
    public void printStudentByLastName(){
        List<Student> studentList=studentRepositroy.findByLastNameNotNull();

    System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByUsingFirstNameAndLastName(){
        Student student=studentRepositroy.findByFirstNameAndLastName("gaurav","kumar");
        System.out.println("student = " + student);
    }



    @Test
    public void printgetStudentByEmailAddress(){
    Student student=studentRepositroy.getStudentByEmailAddress("gaurav@gmail.com");

        System.out.println("student = " + student);
    }


    @Test
    public void printgetStudentFirstNameByEmailAddress(){
        String  firstName=studentRepositroy.getStudentFirstNameByEmailAddress("saurabh@gmail.com");

        System.out.println("firstName = " + firstName);
    }



    @Test
    public void printgetStudentByEmailAddressNative(){
        Student student=studentRepositroy.getStudentByEmailAddressNative("gaurav@gmail.com");

        System.out.println("student = " + student);
    }

    
    
    //native param using 
    @Test
    public void printgetStudentByEmailAddressNativeNamedParam(){
        Student student=studentRepositroy.getStudentByEmailAddressNativeNamedParam("gaurav@gmail.com");

        System.out.println("student = " + student);
    }















}