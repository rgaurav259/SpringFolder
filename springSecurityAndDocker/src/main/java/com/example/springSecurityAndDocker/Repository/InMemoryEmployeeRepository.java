package com.example.springSecurityAndDocker.Repository;

import com.example.springSecurityAndDocker.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

@Repository
public class InMemoryEmployeeRepository {
    private static final List<Employee> DATABASE = new ArrayList<>();

    static {
        DATABASE.add(new Employee(1, "John", "Smith", "john@gmail.com"));
        DATABASE.add(new Employee(2, "Alex", "Raymond", "alex@gmail.com"));
        DATABASE.add(new Employee(3, "David", "Cameron", "david@gmail.com"));
    }

    public Employee addEmployee(Employee employee) {
        DATABASE.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return List.copyOf(DATABASE);
    }

    public Employee findById(Integer id) {
        return DATABASE
                .stream()
                .filter(emp -> id.equals(emp.getId()))
                .findFirst()
                .orElseThrow();
    }

    // Assignment
    public boolean updateEmployee(Employee employee, Integer id) {
        Employee employee1
                = DATABASE.stream().filter(em ->id.equals(em.getId()))
                .findFirst()
                .orElseThrow();
        employee1.setEmail(employee.getEmail());
        employee1.setFirstName(employee1.getFirstName());
        employee1.setLastName(employee.getLastName());
        return DATABASE.add(employee1);


    }

    // Delete employee
    public Boolean deleteById(Integer id) {
        Employee employee = DATABASE
                .stream()
                .filter(emp -> id.equals(emp.getId()))
                .findFirst()
                .orElseThrow();
        DATABASE.remove(employee);
        return TRUE;
    }
}