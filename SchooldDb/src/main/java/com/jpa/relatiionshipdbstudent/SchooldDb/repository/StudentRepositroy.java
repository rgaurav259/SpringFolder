package com.jpa.relatiionshipdbstudent.SchooldDb.repository;

import com.jpa.relatiionshipdbstudent.SchooldDb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositroy extends JpaRepository<Student,Long> {

        public List<Student> findByFirstName(String firstName);//local variable

        //findby name like /% & * etc.
        public List<Student> findByFirstNameContaining(String name);


        List<Student> findByLastNameNotNull();

        //finby guardian both table fields name

        List<Student> findByGuardianName(String guardianName);

        Student findByFirstNameAndLastName(String firstName, String lastName);


}

//custome method followed by field name conventions
//findBy  then fields name