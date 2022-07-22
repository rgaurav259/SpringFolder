package com.example.basicRestApi.basicrestapi.controller;

import com.example.basicRestApi.basicrestapi.Service.DepartmentService;
import com.example.basicRestApi.basicrestapi.entity.Department;
import com.example.basicRestApi.basicrestapi.error.DepartmentNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    //adding logger
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);



    @PostMapping("/saveDepartments")
    public Department saveDepartment( @Valid @RequestBody Department department){

        LOGGER.info("inside savedepartment of DepartmentController");

        return departmentService.saveDepartment(department);
    }

    @GetMapping("/allDepartments")
    public List<Department> fetchDeprtmentList(){

        LOGGER.info("inside fetchDeprtmentList of DepartmentController");
        return departmentService.fetchDeprtmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
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
