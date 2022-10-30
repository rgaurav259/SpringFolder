package com.example.springSecurityAndDocker.Service.Impl;

import com.example.springSecurityAndDocker.Model.Employee;
import com.example.springSecurityAndDocker.Repository.InMemoryEmployeeRepository;
import com.example.springSecurityAndDocker.Service.EmployeeService;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class InmemoryServiceImpl implements EmployeeService {

    private final InMemoryEmployeeRepository inMemoryEmployeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
       return inMemoryEmployeeRepository.addEmployee(employee);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return inMemoryEmployeeRepository.getAllEmployees();
    }

    @Override
    public Employee findById(Integer id) {
        return inMemoryEmployeeRepository.findById(id);
    }

    @Override
    public boolean updateEmployee(Employee employee, Integer id) {
     return inMemoryEmployeeRepository.updateEmployee(employee,id);
    }

    @Override
    public Boolean deleteById(Integer id) {
        return inMemoryEmployeeRepository.deleteById(id);
    }
}
