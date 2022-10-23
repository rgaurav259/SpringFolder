package com.java.sreenuTechDemo;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class ClientDemo {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        List<String> uniqueList = new ArrayList<>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("A");
        lst.add("B");
        System.out.println(lst);
        //remove duplicates
        for (String s : lst){
            if (!uniqueList.contains(s)){
                uniqueList.add(s);
            }
        }
        System.out.println(uniqueList);

        //now using stream
//        lst.stream().distinct().forEach(x-> System.out.println(x));
        lst.stream().distinct().forEach(System.out::println);//method reference

        int[] a = {10,20,30,50,5,5,10};
        //find no.of elements
        long count = Arrays.stream(a).count(); //count return long
        System.out.println(count);
        //now iterate array previous versions
        for (int i =0;i< a.length;i++){
            System.out.print(" " + a[i]);
        }
        //now using stream lambda
        Arrays.stream(a).forEach(x-> System.out.println("using stream to iterate "+x));

        //sorting
//        Arrays.sort(a);
//        for (int i =0;i< a.length;i++){
//            System.out.println(a[i]);
//        }
        //using stream

        Arrays.stream(a).sorted().forEach(System.out::println);
        Arrays.stream(a).distinct().sorted()
                .forEach(System.out::println);

        //sum of array
        int sum =0;
        for (int i =0;i< a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("sum is " + sum);
        //using stream api sum 

        int sum1 = Arrays.stream(a).sum();
        System.out.println("sum1 = " + sum1);

        //ARRAY AVERAGE USING OLD TECHNIQUE

        int summ =0;
        int len= a.length;
        for (int i =0;i<len;i++){
            summ = summ+a[i];
        }
        double averages = summ/len;
        System.out.println("average is  = " + averages);
        
        //now using stream to get average
        OptionalDouble average = Arrays.stream(a).average();//it will return optionalDouble
        System.out.println("average.getAsDouble() = " + average.getAsDouble());

        //display even numbers from array
        for (int i =0;i<a.length;i++){
            if (a[i]%2==0){
                System.out.print("even number is "+a[i] + " ");
            }
        }
        //using stream
        Arrays.stream(a).filter(x-> x%2 ==0).forEach(System.out::println);
        
        //find minimum element
        int intminimum = Arrays.stream(a).min().getAsInt();
        System.out.println("min = " + intminimum);

    }
}
