package com.java.map;
import java.util.*;

public class HashMapExample1 {



        // Main driver method
        public static void main(String[] args) {
            // Creating an empty HashMap
            Map<String, Integer> hm
                    = new HashMap<String, Integer>();

            // Inserting pairs in above Map
            // using put() method
            hm.put("a", 100);
            hm.put("b", 200);
            hm.put("c", 300);
            hm.put("d", 400);

            // Traversing through Map using for-each loop
            for (Map.Entry<String, Integer> me : hm.entrySet()) {

                // Printing keys
                System.out.print(me.getKey() + " : ");
                System.out.println(me.getValue());
            }


            // Creating an empty HashMap
            Map<String, Integer> map = new HashMap<>();

            // Inserting entries in the Map
            // using put() method
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);

            // Iterating over Map
            for (Map.Entry<String, Integer> e : map.entrySet())

                // Printing key-value pairs
                System.out.println(e.getKey() + " "
                        + e.getValue());

            System.out.println("########################################");


            Map<String, Integer> maps = new TreeMap<>();

            // Inserting custom elements in the Map
            // using put() method
            maps.put("vishal", 10);
            maps.put("sachin", 30);
            maps.put("vaibhav", 20);

            // Iterating over Map using for each loop
            for (Map.Entry<String, Integer> e : maps.entrySet())

                // Printing key-value pairs
                System.out.println(e.getKey() + " "
                        + e.getValue());
        }
}

