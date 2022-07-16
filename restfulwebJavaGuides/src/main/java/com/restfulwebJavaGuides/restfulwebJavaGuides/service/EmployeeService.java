package com.restfulwebJavaGuides.restfulwebJavaGuides.service;

import com.restfulwebJavaGuides.restfulwebJavaGuides.model.Employee;

import java.util.List;

public interface EmployeeService  {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(long id);

    Employee getEmployeeByFirstName(String firstName);

    Employee updateEmployee(Employee employee,long id);

    void deleteEmployee(long id);

}
