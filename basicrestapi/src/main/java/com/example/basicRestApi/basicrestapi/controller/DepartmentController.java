package com.example.basicRestApi.basicrestapi.controller;

import com.example.basicRestApi.basicrestapi.Service.DepartmentService;
import com.example.basicRestApi.basicrestapi.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartments")
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);
    }

    @GetMapping("/allDepartments")
    public List<Department> fetchDeprtmentList(){
        return departmentService.fetchDeprtmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);

    }


    @DeleteMapping("/departmentss/{id}")
    public String deleteDeprtmentById(@PathVariable Long departmentID){
         departmentService.deleteDepartmentsById(departmentID);
         return "department deleted successfully";
    }




}
