package com.example.basicRestApi.basicrestapi.Service;

import com.example.basicRestApi.basicrestapi.entity.Department;

import java.util.List;

public interface DepartmentService {
 public    Department saveDepartment(Department department);


 public List<Department> fetchDeprtmentList();

  public Department fetchDepartmentById(Long departmentId);

 public void deleteDepartmentsById(Long departmentID);
}
