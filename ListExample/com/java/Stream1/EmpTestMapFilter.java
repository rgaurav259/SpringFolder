package com.java.Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employeeee{
    int id ;
    String name;
    int salary;

    Employeeee(int id, String name ,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

}


public class EmpTestMapFilter {
    public static void main(String[] args) {

        List<Employeeee> employeeeeList= Arrays.asList(new Employeeee(1,"gaurav",25000),
                new Employeeee(2,"saurav",45000),
                new Employeeee(2,"sscsc",25000),
                new Employeeee(2,"abhishek",555000),
                new Employeeee(2,"amajahs",2000),
                new Employeeee(2,"kajaja",5000)
        );
        
       List<Integer> x= employeeeeList.stream()
                .filter(salaryyyy -> salaryyyy.salary > 30000)
                .map(salaryyyy-> salaryyyy.salary)
                .collect(Collectors.toList());

        System.out.println("x = " + x);
    }
}
