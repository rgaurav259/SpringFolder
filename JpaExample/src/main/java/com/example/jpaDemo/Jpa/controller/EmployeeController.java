package com.example.jpaDemo.Jpa.controller;


import com.example.jpaDemo.Jpa.Entity.Employee;
import com.example.jpaDemo.Jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class EmployeeController {

    @Autowired
     EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public List<Employee> saveEmployees(@RequestBody List<Employee> employeeList){
        return employeeService.saveEmployeeData(employeeList);
    }


    @GetMapping("/getEmployee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/getEmployeeById/{empId}")
    public Employee getEmployees(@PathVariable Long empId){
        return employeeService.getEmployeeById(empId);
    }


    @DeleteMapping("/deleteEmployeeByDesignation/{designation}")
    public List<Employee> deleteEmployeeByDesignation(@PathVariable String designation){
        return employeeService.deleteEmployeeByDesignation(designation);
    }


    @GetMapping("/getEmployeeByDesignation/{designation}")
    public Employee getEmployeeByDesignation(@PathVariable String designation){

        return employeeService.getEmployeeByDesignation(designation);
    }


// findByname

    @GetMapping("/getEmployeeByName/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String  name){
        return employeeService.getEmployeeByName(name);
    }

//paging start

    @RequestMapping(value = "/pagingAndShortingEmployees/{pageNumber}/{pageSize}", method = RequestMethod.GET)

    public Page<Employee> employeePagination(@PathVariable Integer pageNumber, @PathVariable Integer pageSize){

        return employeeService.getEmployeePagination(pageNumber,pageSize,null);
    }


    @RequestMapping(value = "/pagingAndShortingEmployees/{pageNumber}/{pageSize}/{sortProperty}",
            method = RequestMethod.GET)
    public Page<Employee> employeePagination(@PathVariable Integer pageNumber,
                                             @PathVariable Integer pageSize,
                                             @PathVariable String sortProperty) {
        return employeeService.getEmployeePagination(pageNumber, pageSize, sortProperty);
    }

}
