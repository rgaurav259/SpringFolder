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


    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentID){
         departmentService.deleteDepartmentById(departmentID);
         return "department deleted successfully";
    }


    //update department

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }



    //fetch by name
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }



}
