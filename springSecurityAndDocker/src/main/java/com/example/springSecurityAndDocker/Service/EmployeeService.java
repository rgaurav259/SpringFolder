package com.example.springSecurityAndDocker.Service;

import com.example.springSecurityAndDocker.Model.Employee;

import java.util.List;

public interface EmployeeService {
    //save an employees

    Employee addEmployee(Employee employee);

    //Get employee

    List<Employee> getAllEmployees();

    // get one employee
    Employee findById(Integer id);

    //update employee
    boolean updateEmployee(Employee employee, Integer id);

    //delete employee
    Boolean deleteById(Integer id);
}
