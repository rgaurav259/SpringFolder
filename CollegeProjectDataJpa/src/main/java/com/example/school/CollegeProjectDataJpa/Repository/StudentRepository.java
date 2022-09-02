package com.example.school.CollegeProjectDataJpa.Repository;

import com.example.school.CollegeProjectDataJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


   List<Student> findByFirstName(String firstName);

   List<Student> findByFirstNameContaining(String name);

   List<Student> findByLastNameNotNull();

   List<Student> findByGuardianName(String guardianName);

   Student findByFirstNameAndLastName(String firstName, String lastName);

   //jpql query
   //based on classes field we defined not based on table fields


   @Query("select s from Student s where s.emailId = ?1 ")//0ne is first param
   Student getStudentByEmailAddress(String EmmailId);//doesn't get affected method names

   //i want firstname only providing email
   @Query("select s.firstName,s.lastName,s.emailId from Student s where s.emailId = ?1 ")//0ne is first param
   String getStudentFirstNameByEmailAddress(String EmmailId);//i want one value that's why string


   //native query --> sql query
   //exactly tbl column name matched then only execute

   @Query(
           value = "select * from tbl_student s where s.email_address =?1",
           nativeQuery = true
   )
   Student getStudentByEmailAddressNative(String emailId);


   //multiple parameter instead of ?1 we can use columnname which is much more readable

   @Query(
           value = "select * from tbl_student s where s.email_address =:emailId",
           nativeQuery = true
   )
   Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String emaillllId);



   //update data and delete data ,above all methods fetch only now updatew and delete
//native query
//transactional it is service class annotation when or database managed
   @Modifying
   @Transactional
   @Query(
          value = "update tbl_student set first_name = ?1 where email_address = ?2",
           nativeQuery = true
   )
   int updateStudentNameByEmailId(String firstName,String emailId);













}
