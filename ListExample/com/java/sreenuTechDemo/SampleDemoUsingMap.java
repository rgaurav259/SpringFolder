package com.java.sreenuTechDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class SampleDemoUsingMap {

    public static List<Person>createPeople(){
        return List.of(
                new Person("Sara",20),
                new Person("Sara",22),
                new Person("Bob",49),
                new Person("Paula",90),
                new Person("Pal",56),
                new Person("Jack",30),
                new Person("Jill",40),
                new Person("Jack",60),
                new Person("tommy",180)

                );
    }

    public static void main(String[] args) {

        Map<String,Integer> nameAndAge = new HashMap<>();
        for (Person person:createPeople()){
            nameAndAge.put(person.getName(), person.getAge());
        }
        out.println("nameAndAge = " + nameAndAge);


    }
}
