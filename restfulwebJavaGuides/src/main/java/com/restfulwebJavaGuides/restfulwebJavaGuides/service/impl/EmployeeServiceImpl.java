package com.restfulwebJavaGuides.restfulwebJavaGuides.service.impl;

import com.restfulwebJavaGuides.restfulwebJavaGuides.model.Employee;
import com.restfulwebJavaGuides.restfulwebJavaGuides.repository.EmployeeRepository;
import com.restfulwebJavaGuides.restfulwebJavaGuides.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    // constructor injection
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    //--------------
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
