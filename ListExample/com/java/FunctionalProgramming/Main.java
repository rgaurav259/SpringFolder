package com.java.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;


import static com.java.FunctionalProgramming.Main.Gender.FEMALE;
import static com.java.FunctionalProgramming.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John",MALE),
                new Person("Maria",FEMALE),
                new Person("Aisha",FEMALE),
                new Person("Alex",MALE),
                new Person("Alice",FEMALE),
                new Person("Sita",FEMALE),
                new Person("Geeta",FEMALE)

                );


        //imperative approach programming

        System.out.println("    //imperative approach programming");
        List<Person> females = new ArrayList<>();
        for (Person person : people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        //Declarative approach

        System.out.println("    ////Declarative approach approach programming");

        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                //.collect(Collectors.toList())
                .forEach(System.out::println);

        //System.out.println(collect);



    }


    static class Person{
        private final String name;
        private final Gender gender;


        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }

}
