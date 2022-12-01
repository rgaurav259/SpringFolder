package com.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("gaurav","saurav","greg","peter");
//        for (String name : names){
//            if (!name.equals("gaurav"))
//            System.out.println("name = " + name);
//        }
//      names.stream()
//                .filter(name-> !name.equals("gaurav"))
//              .forEach(System.out::println);

        //we can also
        names.stream()
                .filter(StreamDemo::isNotSam)
              .forEach(System.out::println);

    }

    private static boolean isNotSam(String name) {
        return !name.equals("gaurav");
    }
}
