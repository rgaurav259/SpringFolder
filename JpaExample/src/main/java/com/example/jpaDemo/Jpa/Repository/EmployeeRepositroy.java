package com.example.jpaDemo.Jpa.Repository;

import com.example.jpaDemo.Jpa.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

<<<<<<< HEAD
public interface EmployeeRepositroy extends JpaRepository<Employee,Long> {
=======
import java.util.List;

public interface EmployeeRepositroy extends JpaRepository<Employee,Long> {

    Employee findByEmpId(Long id);

    List<Employee> deleteByDesignation(String designation);


    Employee findTopByDesignationOrderBySalaryDesc(String designation);


    List<Employee> findByName(String name);


>>>>>>> feature
}
