package com.java.Stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("gaurav","saurav","abhishek","kumar","gautam");

        List<String> emptyNames= new ArrayList<>();
        //without stream
//        for (String nameeee : names){
//            // add en emptylist data
//           emptyNames.add(nameeee.toUpperCase());
//        }

        //using stream

         emptyNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println("emptyNames = " + emptyNames);
        
        
        /// find length 
      names.stream().map(n -> n.length()).forEach(n-> System.out.println("n = " + n));
        //System.out.println("integerList = " + integerList);

    }
}
