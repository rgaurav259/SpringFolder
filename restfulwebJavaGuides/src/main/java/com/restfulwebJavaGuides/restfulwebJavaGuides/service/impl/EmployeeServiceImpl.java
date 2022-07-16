package com.restfulwebJavaGuides.restfulwebJavaGuides.service.impl;

import com.restfulwebJavaGuides.restfulwebJavaGuides.exception.ResourceNotFoundException;
import com.restfulwebJavaGuides.restfulwebJavaGuides.model.Employee;
import com.restfulwebJavaGuides.restfulwebJavaGuides.repository.EmployeeRepository;
import com.restfulwebJavaGuides.restfulwebJavaGuides.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
       Optional<Employee>employee= employeeRepository.findById(id);
       if (employee.isPresent()){
           return employee.get();
       }else {
           throw new ResourceNotFoundException("Employee","Id",id);
       }

        //using lambda
//        return employeeRepository.findById(id).orElseThrow(()->
//                new ResourceNotFoundException("Employee","Id",id));

    }


    //2nd way it will throw an exceptions
//    @Override
//    public Employee getEmployeeById(long id) {
//        return employeeRepository.findById(id).get();
//    }

    @Override
    public Employee getEmployeeByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {


        //we need to check whether employee with given id is exist in db or not
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Employee","Id",id));
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        //save existing emloyee database
        employeeRepository.save(existingEmployee);
        return existingEmployee;

    }

    @Override
    public void deleteEmployee(long id) {

        //check condition whether a employee exist or not
        employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));


        employeeRepository.deleteById(id);
    }


}
