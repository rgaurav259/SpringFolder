package com.springjpa.SpringJpaPagingandSorting.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String name;
    private Integer age;

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber= (long)(Math.random()*Math.pow(10,10));
    private String designation;
    private Double salary =Math.random()*10000;

}
