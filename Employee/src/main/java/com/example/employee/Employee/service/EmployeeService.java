package com.example.employee.Employee.service;

import com.example.employee.Employee.custom.exception.BusinessException;
import com.example.employee.Employee.entity.Employee;
import com.example.employee.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterf {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        try {
            if (employee.getName().isEmpty() || employee.getName().length()==0){
                throw new BusinessException("601","Please send proper name it is blank");
            }
            Employee savedEmployee = employeeRepository.save(employee);
            return savedEmployee;

        }
        catch (IllegalArgumentException e){
            throw new BusinessException("602","given employee is null"+e.getMessage());
        }
        catch (Exception e){
            throw new BusinessException("603","something went wrong in servicelayer while saving the employee"+e.getMessage());
        }

        //without handling exception
//        Employee savedEmployee = employeeRepository.save(employee);
//        return savedEmployee;

        //we can use directly return  repository.save return
    }

    @Override
    public List<Employee> getAllEmployee() {

        try{
           List<Employee> employeeList= employeeRepository.findAll();
                if (employeeList.isEmpty())
                    throw new BusinessException("604","hey list completely empty");
            return employeeList;
        } catch (Exception e){
            throw new BusinessException("605","something went wrong in servicelayer while fetching all employee"+e.getMessage());


        }

    }

    //without exception handling
//    @Override
//    public List<Employee> getAllEmployee() {
//        return employeeRepository.findAll();
//    }


    @Override
    public Employee getEmployeeById(Long empidl) {
        try {
            return employeeRepository.findById(empidl).get();
        }
        catch (IllegalArgumentException e){
            throw  new BusinessException("606","given employee is null"+e.getMessage());
        }
        catch (NoSuchElementException e){
            throw new BusinessException("607","given id does not exist in databaase "+e.getMessage());
        }


    }

//without exception handling
//    @Override
//    public Employee getEmployeeById(Long empidl) {
//        return employeeRepository.findById(empidl).get();
//    }

    @Override
    public Employee getEmployeeByName(String empnamel) {
        return employeeRepository.findByName(empnamel);
    }

    @Override
    public void deleteEmployeeById(Long empidlocal) {

        try{
            employeeRepository.deleteById(empidlocal);
        }
        catch (IllegalArgumentException e){
            throw new BusinessException("608","Given employee id is null"+e.getMessage());
        }
    }

//without usingf exception handling
//    @Override
//    public void deleteEmployeeById(Long empidlocal) {
//        employeeRepository.deleteById(empidlocal);
//    }


}
