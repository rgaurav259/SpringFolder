package com.example.jpaDemo.Jpa.service;


import com.example.jpaDemo.Jpa.Entity.Employee;
import com.example.jpaDemo.Jpa.Repository.EmployeeRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

//    public Page<Employee> getEmployeePagination(Integer pageNumber, Integer pageSize) {
//
//        Sort sort=Sort.by(Sort.Direction.ASC,"name");
//
//        Pageable pageable= PageRequest.of(pageNumber,pageSize,sort);
//
//        //instead of above we can directly 3 parameters of sort.by method call
//       // Pageable pageable= PageRequest.of(pageNumber,pageSize,Sort.Direction.ASC, "name");
//        //Pageable pageable= PageRequest.of(pageNumber,pageSize);
//
//        return employeeRepositroy.findAll(pageable);
//
//    }

    //instead of hardcoded in name property let's change some parameter in controller layer


    public Page<Employee> getEmployeePagination(Integer pageNumber, Integer pageSize, String sortProperty) {
        Pageable pageable = null;
        if(null!=sortProperty){
            pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC,sortProperty);
        }else {
            pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC,"name");
        }
        return employeeRepositroy.findAll(pageable);
    }
}
