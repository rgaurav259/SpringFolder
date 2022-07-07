package com.example.basicRestApi.basicrestapi.controller;

import com.example.basicRestApi.basicrestapi.Service.DepartmentService;
import com.example.basicRestApi.basicrestapi.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartments")
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);


    }
}
