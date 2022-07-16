package com.restfulwebJavaGuides.restfulwebJavaGuides.repository;

import com.restfulwebJavaGuides.restfulwebJavaGuides.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


   public Employee findByFirstName(String firstName);
}
