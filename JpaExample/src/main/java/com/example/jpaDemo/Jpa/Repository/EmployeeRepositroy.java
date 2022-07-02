package com.example.jpaDemo.Jpa.Repository;

import com.example.jpaDemo.Jpa.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositroy extends JpaRepository<Employee,Long> {
}
