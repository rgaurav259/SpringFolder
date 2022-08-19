package com.springjpa.SpringJpaPagingandSorting.service;


import com.springjpa.SpringJpaPagingandSorting.entity.Employee;
import com.springjpa.SpringJpaPagingandSorting.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> saveEmployeeData(List<Employee> employeeList) {
        return employeeRepository.saveAll(employeeList);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long empId) {
        return employeeRepository.findById(empId).get();
    }


    public void deleteById(Long empId) {
        employeeRepository.deleteById(empId);

    }


    public List<Employee> deleteEmployeeByDesignation(String designation) {

        return employeeRepository.deleteByDesignation(designation);

    }

    public Employee getEmployeeByDesignation(String designation) {
        return employeeRepository.findTopByDesignationOrderBySalaryDesc(designation);

    }

    public Page<Employee> getEmployeePagination(Integer pageNumber, Integer pageSize) {
        //i want to sort according to name order ascending order
        //Sort sort = Sort.by(Sort.Direction.ASC,"name");
//        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        //Pageable pageable = PageRequest.of(pageNumber, pageSize,sort);

        //instead of seperate object creation in sort sort we can directly pass as method parameter

        Pageable pageable = PageRequest.of(pageNumber, pageSize,Sort.Direction.ASC,"name");
        return employeeRepository.findAll(pageable);
    }


    //without hardcorded name property

    public Page<Employee> getEmployeePaginationss(Integer pageNumber, Integer pageSize,String sortProperty) {
        Pageable pageable=null;
        if (null !=sortProperty){
           pageable= PageRequest.of(pageNumber, pageSize,Sort.Direction.ASC,sortProperty);

        }else {
            pageable = PageRequest.of(pageNumber, pageSize,Sort.Direction.ASC,"name");
        }


        return employeeRepository.findAll(pageable);
    }
}
