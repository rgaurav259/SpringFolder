package com.example.springSecurityAndDocker.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
