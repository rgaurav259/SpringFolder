package com.example.employee.Employee.service;

import com.example.employee.Employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterf {
    public Employee addEmployee(Employee employee);

   public List<Employee> getAllEmployee();

   public Employee getEmployeeById(Long empidl);

   public Employee getEmployeeByName(String empnamel);

   public  void deleteEmployeeById(Long empidlocal);
}
