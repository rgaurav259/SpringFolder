package com.example.jpaDemo.Jpa.Entity;

import lombok.Generated;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empid;
    private String name;
    private Integer age;
    @Column(name = "PHONE_NUMBER")
    private Long Longphonenumber;
    private String designation;
    private Double salary;



}
