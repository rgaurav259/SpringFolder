package com.springjpa.SpringJpaPagingandSorting.repository;

import com.springjpa.SpringJpaPagingandSorting.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

  List<Employee> deleteByDesignation(String designation);

  Employee findTopByDesignationOrderBySalaryDesc(String designation);


}
