package com.example.backend.backendrestapireact.services;

import com.example.backend.backendrestapireact.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
