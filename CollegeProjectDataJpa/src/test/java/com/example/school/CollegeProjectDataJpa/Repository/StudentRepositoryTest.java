package com.example.school.CollegeProjectDataJpa.Repository;

import com.example.school.CollegeProjectDataJpa.entity.Guardian;
import com.example.school.CollegeProjectDataJpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("ram@gmail.com")
                .firstName("ram")
                .lastName("kumar")
//                .guardianName("Nikhil")
//                .guardianEmail("nikhil@gmail.com")
//                .guardianMobile("9995656565")
                .build();

        studentRepository.save(student);

    }
    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("gaurav@gmail.com")
                .name("gaurav")
                .mobile("89564555")
                .build();
        Student student = Student.builder()
                .firstName("kanhaiya")
                .emailId("kanhaiya@gmail.com")
                .lastName("sah")
                .guardian(guardian)
                .build();

        studentRepository.save(student);


    }

    @Test
    public void  printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }
    
    @Test
    public void printStudentByFirstName(){
        List<Student> name = studentRepository.findByFirstName("shivam");
        System.out.println("name = " + name);
    }

    @Test
    public  void printStudentByFirstNameContainsName(){
       List<Student> studentList= studentRepository.findByFirstNameContaining("Sa");
        System.out.println("studentList = " + studentList);
        
    }


    @Test
    public void  printStudentBasedOnGuardianName(){
        List<Student> guardianName = studentRepository.findByGuardianName("nikhil");

        System.out.println("guardianName = " + guardianName);
    }


    @Test
    public void printStudentBasedOnFirstNameAndLastName(){
        Student student = studentRepository.findByFirstNameAndLastName("shivam","kumar");

        System.out.println("student = " + student);
    }

    @Test
    public void printStudentBasedOnEmailId(){
        Student studentByEmailAddress = studentRepository.getStudentByEmailAddress("shivam@gmail.com");


        System.out.println("studentByEmailAddress = " + studentByEmailAddress);
    }

    @Test
    public void printGetStudentFirstNameByEmailAddress(){
        String studentByEmailAddress = studentRepository.getStudentFirstNameByEmailAddress("shivam@gmail.com");

        System.out.println("studentByEmailAddress = " + studentByEmailAddress);
    }

    //native query sql query

    @Test
    public void printgetStudentByEmailAddressNative(){
        Student student = studentRepository.getStudentByEmailAddressNative("shivam@gmail.com");

        System.out.println("student = " + student);
    }
    
    //multiple param query
    @Test
    public void printgetStudentByEmailAddressNativeNamedParam(){
        Student studentByEmailAddressNativeNamedParam = studentRepository.getStudentByEmailAddressNativeNamedParam("rahul@gmail.com");
        System.out.println("studentByEmailAddressNativeNamedParam = " + studentByEmailAddressNativeNamedParam);
    }
    @Test
    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId("gauravkumar","kanhaiya@gmail.com");

    }

}