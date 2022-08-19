package com.springjpa.SpringJpaPagingandSorting.controller;


import com.springjpa.SpringJpaPagingandSorting.entity.Employee;
import com.springjpa.SpringJpaPagingandSorting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Transactional
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployees")
    public List<Employee> saveEmployee(@RequestBody List<Employee> employeeList){

        return employeeService.saveEmployeeData(employeeList);
    }

    @GetMapping("/getEmployee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();

    }

    @GetMapping("/getEmployee/{empId}")
    public Employee getEmpById(@PathVariable Long empId){
        return employeeService.findById(empId);

    }

    @DeleteMapping("/deleteemp/{empId}")
    public String deleteEmployeeById(@PathVariable Long empId){
        employeeService.deleteById(empId);
        return "successfully deleted.."+empId;
    }

    @DeleteMapping("/deletebydesignation/{designation}")
    public List<Employee> deleteEmployeeByDesignation(@PathVariable String designation){
       return employeeService.deleteEmployeeByDesignation(designation);

    }

    @GetMapping("/designation/{designation}")
    public Employee getEmployeesByDesignation(@PathVariable String designation){
        return employeeService.getEmployeeByDesignation(designation);
    }

    //pagination

    @RequestMapping(value = "/pagingAndSortingEmployee/{pageNumber}/{pageSize}",method = RequestMethod.GET)
    public Page<Employee> employeePagination(@PathVariable Integer pageNumber,
                                             @PathVariable Integer pageSize){
        return employeeService.getEmployeePagination(pageNumber,pageSize);
    }


    //pagination and sorting

    @RequestMapping(value = "/pagingAndSortingEmployee/{pageNumber}/{pageSize}/{sortProperty}",method = RequestMethod.GET)
    public Page<Employee> employeePaginationss(@PathVariable Integer pageNumber,
                                             @PathVariable Integer pageSize,
                                             @PathVariable String sortProperty){
        return employeeService.getEmployeePaginationss(pageNumber,pageSize,sortProperty);
    }

}
