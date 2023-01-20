package com.java.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentDemo {
    public static void main(String[] args) {

        List<Student> st = new ArrayList<>();
        st.add(new Student(1,"Gaurav"));
        st.add(new Student(2,"saurav"));
        st.add(new Student(3,"abhsihek"));
        st.add(new Student(4,"SITA"));
        //iterate
        
//        for (Student student: st){
//            System.out.println("student = " + student);
//        }
        //second way 
        Iterator<Student> iterator = st.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
        //forEach
        st.forEach(System.out::println);

        //now i want to backward direction output
        ListIterator<Student> li = st.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("###############################");

        while (li.hasPrevious()){
            System.out.println("hasPrevious() = " + li.previous());
        }


    }
}
