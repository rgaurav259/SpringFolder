//package com.example.AmigoRestApi.student;
//
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//import static java.util.Calendar.AUGUST;
//
//@Configuration
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args -> {
//            Student gaurav = new Student( "gaurav",
//                    "gaurav@gmail.com",
//                    LocalDate.of(2004, AUGUST, 8)
//
//            );
//
//            Student abhishek = new Student( "abhishek",
//                    "abhishek@gmail.com",
//                    LocalDate.of(1996, AUGUST, 8)
//
//            );
//            studentRepository.saveAll(
//
//                    List.of(gaurav,abhishek)
//            );
//
//        };
//    }
//
//}
