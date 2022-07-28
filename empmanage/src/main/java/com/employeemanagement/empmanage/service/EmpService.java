package com.employeemanagement.empmanage.service;

import com.employeemanagement.empmanage.entity.Employee;
import com.employeemanagement.empmanage.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    public void addEmp(Employee employee){
        empRepo.save(employee);
    }
}
