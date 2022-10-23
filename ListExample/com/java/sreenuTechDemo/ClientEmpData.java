package com.java.sreenuTechDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ClientEmpData {
    public static void main(String[] args) {

        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(1,"gaurav",10000));
        empList.add(new Emp(2,"saurav",10000));
        empList.add(new Emp(3,"Abhishek",90000));
        empList.add(new Emp(4,"satyam",18000));
        empList.add(new Emp(5,"aasha",1200));


        //diplay employee who is salary greater than
        empList.stream().filter(x->x.getSalary()>7000).forEach(System.out::println);

        //how many employees greater than salary count
        long count = empList.stream().filter(x -> x.getSalary() > 7000).count();
        System.out.println("count employee = " + count);

        //max salary

        Optional<Emp> max = empList.stream().max(Comparator.comparing(x -> x.getSalary()));
        System.out.println("maximu salary is  = " + max.get());
        //i want only name not all the field

        String s = empList.stream()
                .max(Comparator.comparing(x -> x.getSalary()))
                .map(y -> y.ename).get();


        System.out.println("name is  = " + s);
    }
}
