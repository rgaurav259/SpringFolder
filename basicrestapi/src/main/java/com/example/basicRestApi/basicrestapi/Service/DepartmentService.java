package com.example.basicRestApi.basicrestapi.Service;

import com.example.basicRestApi.basicrestapi.entity.Department;
import com.example.basicRestApi.basicrestapi.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
 public    Department saveDepartment(Department department);


 public List<Department> fetchDeprtmentList();

  public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;


 public void deleteDepartmentById(Long departmentID);

 public Department updateDepartment(Long departmentId, Department department);

 public Department fetchDepartmentByName(String departmentName);


}
