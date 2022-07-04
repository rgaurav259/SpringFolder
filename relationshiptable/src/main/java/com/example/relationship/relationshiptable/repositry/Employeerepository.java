package com.example.relationship.relationshiptable.repositry;

import com.example.relationship.relationshiptable.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee, Long> {
}
