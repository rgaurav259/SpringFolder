package com.example.jpaDemo.Jpa.Entity;

<<<<<<< HEAD
import lombok.Generated;
=======
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
>>>>>>> feature

import javax.persistence.*;

@Entity
<<<<<<< HEAD
=======
@Data
@NoArgsConstructor
@AllArgsConstructor
>>>>>>> feature
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
    private Long empid;
    private String name;
    private Integer age;
    @Column(name = "PHONE_NUMBER")
    private Long Longphonenumber;
    private String designation;
    private Double salary;


=======
    private Long empId;
    private String name;
    private Integer age;
    @Column(name = "PHONE_NUMBER")
    private Long phonenumber =(long) (Math.random()*Math.pow(10,10));
    private String designation;
    private Double salary =Math.random()*100000;

//if you dont't want to every time typed phone number you cnad do one thing
    // generated auto value using math.random fundctiosn
>>>>>>> feature

}
