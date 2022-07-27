package com.java.Stream1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(15);
        al.add(3000000);
        al.add(35);
        al.add(45);
        System.out.println("arrayList = " + al);


        List<Integer> integerList = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println("al = " + integerList);

        List<Integer> updatedData = al.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println("updatedData = " + updatedData);
        
        //failed students count

        long count = al.stream().filter(marks -> marks < 35).count();
        System.out.println("count = " + count);
        
        //Sorting  default sorting ascending order

        List<Integer> sortedlist = al.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedlist default ascending Order = " + sortedlist);
        
        //// DEscending ORDER SORTING
        // 1st way

        List<Integer> DESCENDINGSORTING = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("DESCENDINGSORTING = " + DESCENDINGSORTING);
        //2nd way
        List<Integer> UsingComparator_reverse = al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("UsingComparator_reverse = " + UsingComparator_reverse);
        //3rd way
        List<Integer> argumentsNEgativeSorting = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("argumentsNEgativeSorting = " + argumentsNEgativeSorting);

///-------------------------------------------------STRING      ----------    Print

        ArrayList<String> l = new ArrayList<>();
        l.add("Sunny");
        l.add("kajal");
        l.add("anushka");
        l.add("ABABABA");
        l.add("AAAAAAAAAAAAAAAAAA");
        l.add("A");
        l.add("bunny");

        l.add("chinny");
        System.out.println("arrayList = " + l);

        List<String> defaultsorting = l.stream().sorted().collect(Collectors.toList());
        System.out.println("defaultsorting  alphanumeric= " + defaultsorting);
        List<String> defaultsortingusingown = l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("defaultsortingusingown = " + defaultsortingusingown);

        List<String> reverseSorting = l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());

        System.out.println("reverseSorting = " + reverseSorting);
        List<String> reverseSortingDifferentMethod = l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("reverseSortingDifferentMethod = " + reverseSortingDifferentMethod);


        System.out.println("--------------######################------------------------------");
        List<String> reverseSortingusingcompartorreverseMEthod = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverseSortingusingcompartorreverseMEthod = " + reverseSortingusingcompartorreverseMEthod);

        System.out.println("--------------######################------------------------------");


        ///Sorting according to lenth order

        Comparator<String> c =(s1,s2)->{
            int l1 =s1.length();
            int l2 =s2.length();
            if (l1<l2) return -1;
            else if (l1>l2) return +1;
            else return s1.compareTo(s2);//if we return 0 then it will treat as duplicate and remove so..
        };

        List<String> ownsortingaccordingtolength=l.stream().sorted(c).collect(Collectors.toList());
        System.out.println("ownsortingaccordingtolength order = " + ownsortingaccordingtolength);


   
    }


}
