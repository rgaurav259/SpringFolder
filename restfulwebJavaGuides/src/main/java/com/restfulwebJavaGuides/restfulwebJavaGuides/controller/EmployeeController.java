package com.restfulwebJavaGuides.restfulwebJavaGuides.controller;

import com.restfulwebJavaGuides.restfulwebJavaGuides.model.Employee;
import com.restfulwebJavaGuides.restfulwebJavaGuides.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    //build create employee rest api
    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }


    //get All Employees List
    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(),HttpStatus.OK);
    }

//    @GetMapping("/getAllEmployee/{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
//        return new ResponseEntity<Employee>(employeeService.getEmployeeById(id),HttpStatus.OK);
//        //2nd way
//    }


    //2nd way
    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<Employee> getEmployeeByID(@PathVariable ("id") long employeeId){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);

    }



    @GetMapping("/getAllEmployeeByName/{firstName}")
    public ResponseEntity<Employee> getAllEmployeeByName(@PathVariable String firstName){
        return new ResponseEntity<Employee>(employeeService.getEmployeeByFirstName(firstName),HttpStatus.OK);
    }


    //update
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,
                                                   @RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id),HttpStatus.OK);
    }


    //delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String>deleteEmployeeById(@PathVariable("id") long id){

        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted successfully",HttpStatus.OK);
    }

}
