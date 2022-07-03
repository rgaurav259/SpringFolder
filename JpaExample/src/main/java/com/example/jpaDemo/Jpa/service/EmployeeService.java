package com.example.jpaDemo.Jpa.service;


import com.example.jpaDemo.Jpa.Entity.Employee;
import com.example.jpaDemo.Jpa.Repository.EmployeeRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

@Autowired
EmployeeRepositroy employeeRepositroy;

    public List<Employee> saveEmployeeData(List<Employee> employeeList) {
        return employeeRepositroy.saveAll(employeeList);
    }

    public List<Employee> getEmployees() {
        return employeeRepositroy.findAll();
    }

    public Employee getEmployeeById(Long empId) {
        return employeeRepositroy.findByEmpId(empId);

    }


    public List<Employee> deleteEmployeeByDesignation(String designation) {
        return employeeRepositroy.deleteByDesignation(designation);
    }

    public Employee getEmployeeByDesignation(String designation) {
        return employeeRepositroy.findTopByDesignationOrderBySalaryDesc(designation);

    }

    public List<Employee> getEmployeeByName(String name) {
        return employeeRepositroy.findByName(name);
    }
}
