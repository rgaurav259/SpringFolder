package com.java.lambdaExprssion;

import java.util.ArrayList;
import java.util.function.Predicate;

class Emp{
    String name;
    double salary;

    //constructor
    Emp(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

}


public class PredicateExample3 {
    public static void main(String[] args) {

        ArrayList<Emp> al = new ArrayList();
        al.add(new Emp("gaurav",1000));
        al.add(new Emp("saurav",20000));
        al.add(new Emp("abhishek",5000));
        al.add(new Emp("shyam",3000));
        al.add(new Emp("anktraj",4000));
        al.add(new Emp("nitin",4400));
        //System.out.println("al = " + al);

        Predicate<Emp> p =emp -> emp.salary > 3000;
        for (Emp employee : al){
            if (p.test(employee)){
                System.out.println(employee.name+ ":"+employee.salary);
            }
        }

    }
}
