package com.example.SpringRest.demo.service;

import com.example.SpringRest.demo.exception.StudentNotFoundException;
import com.example.SpringRest.demo.model.Student;
import com.example.SpringRest.demo.repository.StudentRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    //autowired as a constructor injection
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    //save student
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    //fetchall
    public List<Student> fetchAllStudent(){
        return studentRepository.findAll();
    }

    public Student fetchStudentById(int id){

        return studentRepository.findById(id).orElseThrow(()-> new StudentNotFoundException("Student not found:"+id));
    }



    //update student
    public Student updateStudent(@NonNull Student student){
      Student selectedStudent=  fetchStudentById(student.getId());

      if (selectedStudent !=null && selectedStudent.getName()!=null && selectedStudent.getEmail()!=null){
          selectedStudent.setName(student.getName());
          selectedStudent.setEmail(student.getEmail());
          studentRepository.save(selectedStudent);
      }
      return student;
    }


    //delete

    public String deleteStudent(@NonNull int id){
        studentRepository.deleteById(id);
        return "student deleted with id : " +id;
    }


}
