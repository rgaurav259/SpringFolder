package com.example.relationship.relationshiptable.controller;

import com.example.relationship.relationshiptable.entity.Employee;
import com.example.relationship.relationshiptable.repositry.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private Employeerepository employeerepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData){
        employeerepository.saveAll(empData);
        return ResponseEntity.ok("Data Saved!...");
    }


}
