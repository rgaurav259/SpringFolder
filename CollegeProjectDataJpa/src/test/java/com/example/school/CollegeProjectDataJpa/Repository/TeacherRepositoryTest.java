package com.example.school.CollegeProjectDataJpa.Repository;

import com.example.school.CollegeProjectDataJpa.entity.Course;
import com.example.school.CollegeProjectDataJpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course courseDba = Course
                .builder()
                .title("DBA")
                .credit(5)
                .build();
        Course courseJava = Course
                .builder()
                .title("JAVA")
                .credit(7)
                .build();

        Teacher teacher =
                Teacher.builder()
                        .firstName("Qutub")
                        .lastName("khan")
                       // .courses(List.of(courseDba,courseJava))
                        .build();

        teacherRepository.save(teacher);
    }

}