package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapExample {
    public static void main(String[] args) {

        //country(key) population(value)//unordered map by default
        HashMap<String,Integer> map= new HashMap<>();
        map.put("INDIA",120);
        map.put("US",130);
        map.put("CHINA",150);

        System.out.println("map = " + map);

        map.put("CHINA",180);

        System.out.println("map = " + map);
//        map = {CHINA=150, INDIA=120, US=130}  output
//        map = {CHINA=180, INDIA=120, US=130}
        System.out.println("map = " + map);

        //search
        if (map.containsKey("CHINA")){
            System.out.println(" present key in the map " );
        }else {
            System.out.println("not present");
        }
        // if i have key then i want to value
        System.out.println(map.get("CHINA"));//it will return key
        System.out.println(map.values());//it will return key all
        System.out.println(map.entrySet());

        //iteration i hasmap
        for (Map.Entry<String, Integer> m : map.entrySet()){
            System.out.print(m+" ");
            System.out.print(m.getKey()+" ");
        }

        //second way to iterate over map
        Set<String> keys = map.keySet();
        for (String k : keys){
            System.out.println(k + " " + map.get(k));
        }

        //remove
        Integer re = map.remove("CHINA");
        System.out.println(re);


    }
}
