package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {


        //create a list of values

        List<Integer> list1 = List.of(2, 4, 22, 50, 80, 45, 23, 56); //this will return immutable list we can't add list1.add

        System.out.println("list1 = " + list1);

        //2nd method to create a list
//        List<Integer> list2= new ArrayList<>();
//        list2.add(10);
//        list2.add(7);
//        list2.add(9);
//        list2.add(122);
//        list2.add(100);
//
//        System.out.println("list2 = " + list2);
//
        
        //3rd way create a list

//        List<Integer> integerList = Arrays.asList(10, 20, 30, 40, 89, 15, 25, 4625, 45, 5, 45);
//        System.out.println("integerList = " + integerList);


        //now working on list1  we have to collect even number and stored the result to new list
//without stream api
//        List<Integer> listeven=new ArrayList<>();
//
//        for (Integer i : list1) {
//            if (i % 2 == 0){
//              listeven.add(i);
//            }
//
//        }
//        System.out.println("listeven = " + listeven);
//        System.out.println("list1 = " + list1);
        



        // USing STREAMAPI-----------------

            Stream<Integer> stream1=  list1.stream();

//        List<Integer> newList = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());
//
//
//        System.out.println("newList = " + newList);


        // filter result greater than

        List<Integer> newGreaterList =   stream1.filter(i-> i>20).collect(Collectors.toList());

        System.out.println("newGreaterList = " + newGreaterList);







    }

}
