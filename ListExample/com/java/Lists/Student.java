package com.java.Lists;

public class Student {
    private int id;
    private String name;
    //constructor

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
