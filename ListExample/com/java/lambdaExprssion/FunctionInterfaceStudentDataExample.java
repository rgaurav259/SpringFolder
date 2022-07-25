package com.java.lambdaExprssion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;

    //constructor
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

}


public class FunctionInterfaceStudentDataExample {
    public static void main(String[] args) {

        Function<Student,String> f = s->{
            int marks= s.marks;
            String grade= "";
            if (marks >= 80) grade="A[Distinction]";
            else if(marks >= 60) grade="B[First Divison]";
            else if(marks >= 50) grade="C[second Divison]";
            else if(marks >= 35) grade="D[Third Divison]";
            else grade="E[FAILED...]";
            return grade;

        };
        Predicate<Student> p =s->s.marks>=60;// && s.marks%2==0;

       // now student data store an array
        Student [] str = { new Student("Gaurav",89),
                            new Student("GAUTAM",80),
                            new Student("saurav",65),
                            new Student("abhishek",55),
                            new Student("nitin",45),
                            new Student("shyam ",25),
                            new Student("aakash ",10),
                            new Student("Ram",50)        };

//        ArrayList<Student> al = new ArrayList();
//        al.add(new Student("gaurav",99));

        //now i want to apply predicate also

        for (Student s1 :str) {
            if (p.test(s1)) {//if greater than 60 marks then only prints students
                System.out.println("Student Name is: " + s1.name);
                System.out.println("Student Marks is: " + s1.marks);
                System.out.println("Student grade is: " + f.apply(s1));
                System.out.println("---------------------------------------");
            }
        }
        //for each student printed one by one in loop
    }

}
