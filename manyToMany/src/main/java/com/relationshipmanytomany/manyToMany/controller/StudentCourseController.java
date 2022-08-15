package com.relationshipmanytomany.manyToMany.controller;

import com.relationshipmanytomany.manyToMany.entity.Course;
import com.relationshipmanytomany.manyToMany.entity.Student;
import com.relationshipmanytomany.manyToMany.repository.CourseRepository;
import com.relationshipmanytomany.manyToMany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {


    private StudentRepository studentRepository;

    private CourseRepository courseRepository;


    public StudentCourseController(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }



    @PostMapping
    public Student saveStudentWithCourse(@RequestBody Student student){

       return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return studentRepository.findAll();

    }

    @GetMapping("/{studentId}")
    public Student findStudent(@PathVariable Long studentId){
        return studentRepository.findById(studentId).orElse(null);
    }


    @GetMapping("/find/{name}")
    public List<Student> findStudentContainingByName(@PathVariable String name){
            return studentRepository.findByNameContaining(name);
    }

    @GetMapping("/search/{price}")
    public List<Course> findCourseLessThanPrice(@PathVariable double price){
        return courseRepository.findByFeeLessThan(price);
    }

}
