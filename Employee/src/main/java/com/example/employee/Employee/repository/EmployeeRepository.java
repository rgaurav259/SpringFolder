package com.example.employee.Employee.repository;

import com.example.employee.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByName(String empnamel);
}
