package com.example.basicRestApi.basicrestapi.Service;

import com.example.basicRestApi.basicrestapi.Repository.DepartmentRepository;
import com.example.basicRestApi.basicrestapi.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDeprtmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentsById(Long departmentID) {
        departmentRepository.deleteById(departmentID);
    }


}
