package com.example.basicRestApi.basicrestapi.Service;

import com.example.basicRestApi.basicrestapi.Repository.DepartmentRepository;
import com.example.basicRestApi.basicrestapi.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }






}
