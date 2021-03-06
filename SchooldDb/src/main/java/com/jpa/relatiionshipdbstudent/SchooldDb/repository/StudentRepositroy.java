package com.jpa.relatiionshipdbstudent.SchooldDb.repository;

import com.jpa.relatiionshipdbstudent.SchooldDb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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


        //JPQL query start
         //followed by class name not not database column name
//followed by class name and fields name query
        @Query("select s from Student s where s.emailId =?1")
        Student getStudentByEmailAddress(String emailId);


        @Query("select s.firstName from  Student s where s.emailId =?1")
        String getStudentFirstNameByEmailAddress(String emailId);


//NATIVE QERY EXAMPLE------------------------------------$$$$$$$$$$$$$$############################################

        @Query(
                value = "SELECT * FROM tbl_student s where s.email_address = ?1",
                nativeQuery = true
        )
        Student getStudentByEmailAddressNative(String emailId);



        //native name param define

        @Query(
                value = "SELECT * FROM tbl_student s where s.email_address = :emailId",
                nativeQuery = true
        )
        Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String emailId);




        //------------------#############   UPDATE METHOD---------------------------------------------
        @Modifying
        @Transactional
        @Query(
                value ="update tbl_student set first_Name=?1 where email_address =?2 ",
                nativeQuery = true
        )
        int updateStudentNameByEmailId(String firstName,String emailId);






}

//custome method followed by field name conventions
//findBy  then fields name