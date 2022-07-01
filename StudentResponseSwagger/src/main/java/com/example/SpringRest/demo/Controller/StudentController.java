package com.example.SpringRest.demo.Controller;

import com.example.SpringRest.demo.model.Student;
import com.example.SpringRest.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){

        return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.CREATED);
    }


    @GetMapping("/fetchAll")
    public ResponseEntity<List<Student>> fetchAllStudent(){

        return new ResponseEntity<List<Student>>(studentService.fetchAllStudent(), HttpStatus.OK);
    }


    @GetMapping("/fetchStudentById/{id}")
    public ResponseEntity<Student> fetchStudentById(@PathVariable int id){
        return new ResponseEntity<Student>(studentService.fetchStudentById(id),HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity<Student> update(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.updateStudent(student),HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteByid(@PathVariable int id){
        return new ResponseEntity<String>(studentService.deleteStudent(id),HttpStatus.ACCEPTED);
    }

}
