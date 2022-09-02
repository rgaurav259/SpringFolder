package com.example.school.CollegeProjectDataJpa.Repository;

import com.example.school.CollegeProjectDataJpa.entity.Course;
import com.example.school.CollegeProjectDataJpa.entity.Student;
import com.example.school.CollegeProjectDataJpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;


    @Test
    public void printCourse(){
        List<Course> printCourses = courseRepository.findAll();

        System.out.println("printCourses = " + printCourses);
    }



    //savecourse with teacher objecrt

    @Test
    public void saveCourseWithTeacher(){

        Teacher teacher = Teacher.builder()
                .firstName("Priyanka")
                .lastName("Singh")
                .build();

        Course course = Course.builder()
                .title("Python")
                .credit(10)
                .teacher(teacher)
                .build();

        courseRepository.save(course);


    }

    //paginationa and sorting
    @Test
    public void findAllPagination(){

        Pageable  firstPageWithThreeRecords =
                PageRequest.of(0,3);


        Pageable  secondPageWithTwoRecords =
                PageRequest.of(1,2);

        List<Course> courses = courseRepository.findAll(secondPageWithTwoRecords)
                .getContent();

        long totalElements =courseRepository.findAll(secondPageWithTwoRecords)
                        .getTotalElements();

        long totalPages = courseRepository.findAll(secondPageWithTwoRecords)
                .getTotalPages();
        System.out.println("totalPages = " + totalPages);
        System.out.println("totalElements = " + totalElements);
        System.out.println("courses = " + courses);
    }


    //pagination with sorting .....................
    @Test
    public void findAllSorting(){
        Pageable sortByTitle =
                PageRequest.of(0,2, Sort.by("title"));

        Pageable sortByCredirDesc=
                PageRequest.of(0,2,Sort.by("credit").descending());

        Pageable sortByTitleAndCreditDesc =
                PageRequest.of(0,2,
                        Sort.by("title")
                        .descending()
                        .and(Sort.by("credit")));

        List<Course> courseList =
                courseRepository.findAll(sortByTitle).getContent();

        List<Course> courseListss =
                courseRepository.findAll(sortByCredirDesc).getContent();
        System.out.println("courseListss = " + courseListss);
        
        System.out.println("courseList = " + courseList);
    }

    //own custom pageable method
    @Test
    public void printfindbyTitleContainig(){
        Pageable firstPageTenRecords =
                PageRequest.of(0,10);

        List<Course> courseList =
                courseRepository.findByTitleContaining("D",
                        firstPageTenRecords).getContent();

        System.out.println("courseList = " + courseList);
    }


    //---------------------------------------------

    @Test
    public void saveCourseWithStudentAndTeacher(){

        Teacher teacher = Teacher.builder()
                .firstName("Lizzie")
                .lastName("morgan")
                .build();

        Student student = Student.builder()
                .firstName("Abhishek")
                .lastName("singh")
                .emailId("Abhishek@gmail.com")
                .build();

        Course course = Course.builder()
                .title("AI")
                .credit(12)
                .teacher(teacher)
                .build();

        course.addStudents(student);

        courseRepository.save(course);


    }

}