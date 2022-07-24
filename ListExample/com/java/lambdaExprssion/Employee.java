package com.java.lambdaExprssion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    String name;
    int eno;

    //    Constructor
    Employee(String name,int eno){
        this.name=name;
        this.eno=eno;
    }

    //toString method calling internally
    public String toString(){
        return eno +"---"+name;
    }


}
class Test{
    public static void main(String[] args) {
//        Employee employee = new Employee("gaurav",100);
//        Employee employee1 = new Employee("saurav",200);
//        System.out.println(employee);
//        System.out.println(employee1);
        // -------------------------------
//        we can add arraylist object

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("gaurav",500));
        al.add(new Employee("saurav",100));
        al.add(new Employee("Abhishek",300));
        al.add(new Employee("gautam",900));
        al.add(new Employee("ranaranjit",1000));

        System.out.println(al);
        //using stream
        al.stream().forEach(System.out::println);

        //now i want to sorting order employee list

        Comparator<Employee> t =(I1,I2)->{return (I1.eno < I2.eno) ? -1:(I1.eno >I2.eno)? +1:0;};
        //Comparator<Employee> t1 =(I1,I2)->(I1.eno < I2.eno) ? -1:(I1.eno >I2.eno)? +1:0;

        //Comparator<Employee> t =(I1,I2)->{return Integer.compare(I1.eno, I2.eno);};

        Collections.sort(al,t);
        System.out.println("After sorting number ascending order"+al);

       // we can directly pass collections.sort method also
        Collections.sort(al,(I1,I2)->(I1.eno < I2.eno) ? -1:(I1.eno >I2.eno)? +1:0);

        System.out.println("after directly"+al);


        //compare to always returns alphabetical order for string ,     and number to ascending order

        //sort based on alphabetical ordr
        Collections.sort(al,(I1,I2)->I1.name.compareTo(I2.name));
        System.out.println("alphabrtical order by default = " + al);







    }
}

