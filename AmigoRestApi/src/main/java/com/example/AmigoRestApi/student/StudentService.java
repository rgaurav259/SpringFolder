package com.example.AmigoRestApi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {



    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudent(){

        return studentRepository.findAll();

    }


    public void addNewStudent(Student student) {

        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()){
            throw new IllegalArgumentException("email taken already");
        }
        studentRepository.save(student);

//        System.out.println("student = " + student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);

        if (!exists){
            throw new IllegalStateException("Student with id" + studentId + "not found");
        }
        studentRepository.deleteById(studentId);

    }

    @Transactional
    public Student updateStudent(Long studentId, String name, String email) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "student with id " + studentId + "doesn't exist"
                ));

        if (name != null && name.length() > 0 && !Objects.equals(student.getName(),name)){
            student.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(),email)){
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);

            if (studentOptional.isPresent()){
                throw new IllegalStateException("emal taken man..");
            }

            student.setEmail(email);

        }
        System.out.println("student = " + student);
        studentRepository.save(student);


        return student;
    }
}
