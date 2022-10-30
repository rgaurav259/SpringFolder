package com.example.springSecurityAndDocker.Resources;

import com.example.springSecurityAndDocker.Model.Employee;
import com.example.springSecurityAndDocker.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentRequest;

@RestController
@RequestMapping(path = "/api/employees")
@RequiredArgsConstructor
public class EmployeeResources {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployee (@PathVariable("id") Integer id) {
        return ResponseEntity.ok(employeeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee (@RequestBody Employee employee) {
        //employee.setId(employeeService.getAllEmployees().size() + 1);
        return ResponseEntity.created(getLocation(employee.getId())).body(employeeService.addEmployee(employee));
    }

    private URI getLocation(Integer id) {
        return fromCurrentRequest().path("{id}").buildAndExpand(id).toUri();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteEmployee (@PathVariable("id") Integer id) {
        return ResponseEntity.ok(employeeService.deleteById(id));
    }

    @PutMapping("/{id/employee}")
    public ResponseEntity<Boolean> updateEmployee (@PathVariable Employee employee, Integer id) {
        return ResponseEntity.ok (employeeService.updateEmployee(employee,id));
    }
}
