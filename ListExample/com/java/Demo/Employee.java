package com.java.Demo;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee implements Comparable{

    String name;
    int eid;
    //constructor
    Employee(String name,int eid){
        this.name=name;
        this.eid=eid;
    }
    //ToString method
    public String toString(){
        return name +"---"+eid;
    }

    @Override
    public int compareTo(Object obj) {
        int eid1 =this.eid;
        Employee e =(Employee) obj;
        int eid2 =e.eid;

        if (eid1 < eid2)
            return -1;
        else if (eid > eid2)
            return +1;
        else return 0;

    }
}

class CompComp{
    public static void main(String[] args) {
        Employee e1=new Employee("gaurav",100);
        Employee e2 =new Employee("saurav",200);
        Employee e3 =new Employee("abhishek",300);
        Employee e4 =new Employee("gaurav",100);
        Employee e5 =new Employee("ranjit",400);
        Employee e6 =new Employee("aakkshs",2323);



        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        t.add(e6);

        System.out.println("Employee = " + t); // by default natural sorting ordeer


        //my own customized sorting
        TreeSet t1 = new TreeSet(new Mycomp());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        t1.add(e6);
        System.out.println("Customized Employee = " + t1);//our own sorting order


    }
}

class Mycomp implements Comparator{

    @Override
    public int compare(Object obj1, Object obj2) {
        Employee e1 =(Employee) obj1;
        Employee e2 =(Employee) obj2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);

    }
}