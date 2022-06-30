package com.example.employee.Employee.controller;

import com.example.employee.Employee.custom.exception.BusinessException;
import com.example.employee.Employee.custom.exception.ControllerException;
import com.example.employee.Employee.entity.Employee;
import com.example.employee.Employee.service.EmployeeServiceInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/code")
public class EmployeeController {

    @Autowired
    private EmployeeServiceInterf employeeServiceInterf;


//without using try catch
//    @PostMapping("/save")
//    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
//       Employee employeeSaved= employeeServiceInterf.addEmployee(employee);
//        return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED) ;
//    }

    @PostMapping("/save")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){

        try {
            Employee employeeSaved = employeeServiceInterf.addEmployee(employee);
            return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
        } catch (BusinessException e){
            ControllerException ce= new ControllerException(e.getErrorCode(),e.getErrorMessage());
            return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            ControllerException ce= new ControllerException("611","Something went wrong in controller lahyer");
            return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);

        }
    }



    //getall

    @GetMapping("/getall")
    public ResponseEntity<List<Employee>> getAllEmployee(){
      List<Employee> listofAllemps=  employeeServiceInterf.getAllEmployee();

      return new ResponseEntity<List<Employee>>(listofAllemps,HttpStatus.OK);
    }

//without exception handling
//    //getbyid
//    @GetMapping("/getEmployeeById/{empid}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable("empid") Long empidl){
//       Employee employees=employeeServiceInterf.getEmployeeById(empidl);
//        return new ResponseEntity<Employee>(employees,HttpStatus.OK);
//    }


    //getbyid
    @GetMapping("/getEmployeeById/{empid}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("empid") Long empidl){
       try {
           Employee employees = employeeServiceInterf.getEmployeeById(empidl);
           return new ResponseEntity<Employee>(employees, HttpStatus.OK);
       }
       catch (BusinessException e){
           ControllerException ce= new ControllerException(e.getErrorCode(),e.getErrorMessage());
           return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
       }catch (Exception e){
           ControllerException ce= new ControllerException("612","Something went wrong in controller lahyer");
           return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);

       }
    }


    //getByName

    @GetMapping("/getbyname/{empname}")
    public ResponseEntity<Employee> getEmployeeByName(@PathVariable ("empname") String empnamel){
        Employee employeename=employeeServiceInterf.getEmployeeByName(empnamel);
        return new ResponseEntity<Employee>(employeename,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empid}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable("empid") Long empidlocal){
        employeeServiceInterf.deleteEmployeeById(empidlocal);
        return  new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }



    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee employeeSaved= employeeServiceInterf.addEmployee(employee);
        return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED) ;
    }


}
