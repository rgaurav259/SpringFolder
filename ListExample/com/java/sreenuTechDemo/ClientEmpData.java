package com.java.sreenuTechDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientEmpData {
    public static void main(String[] args) {

        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(1,"gaurav",10000,30));
        empList.add(new Emp(2,"saurav",10000,40));
        empList.add(new Emp(3,"Abhishek",90000,50));
        empList.add(new Emp(4,"satyam",18000,10));
        empList.add(new Emp(5,"aasha",1200,25));


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

        //using reduce
        Optional<Integer> reduce = empList.stream()
                .map(Emp::getSalary)
                .reduce(Integer::sum);

        System.out.println("usingreduced = " + reduce);

        //another way
        List<String> collect = empList.stream()
                .filter(x -> x.getSalary() > 10000)
                .map(Emp::getEname).collect(Collectors.toList());

        System.out.println("stringStream = " + collect);


        //question is get the list of names in uppercase of those who are older than 30
        //don't do this

        List<String> namesOfOlderThan20 = new ArrayList<>();

         empList.stream()
                .filter(emp -> emp.getAge() > 30)
                .map(Emp::getEname)
                .map(String::toUpperCase)
                 .forEach(name-> namesOfOlderThan20.add(name));
        System.out.println("namesOfOlderThan20 = " + namesOfOlderThan20);
        
        //because of impure functions we have to provide pure functions only
        //now


        //right way delegate the collectors -----------------------
        List<String> namesOlessThan30 = empList.stream()
                .filter(emp -> emp.getAge() < 30)
                .map(Emp::getEname)
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("namesOlessThan30 = " + namesOlessThan30);



    }
}
