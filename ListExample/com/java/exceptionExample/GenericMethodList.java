/*
* cretae a method getCount(T input ) which return the count of characteristics
input:  "Neeraj";
* output: {n=1,e=2,r=1,a=1,j=1}
*
* input 12244401
 output:{0=1,1=2,2=2,4=3}
* * * */

package com.java.exceptionExample;

import java.util.HashMap;
import java.util.Map;

public class GenericMethodList<T> {

    public static void main(String[] args) {

      Map<String, Integer> out1=  new GenericMethodList().getCount("raam");
      Map<String,Integer> out2=  new GenericMethodList().getCount(1221);

        System.out.println("out1 = " + out1);
        System.out.println("out2 = " + out2);



    }


    public Map<String,Integer> getCount(T input) {

        String[] splitstrings = input.toString().split("");//"n","e","e","r","a","j"

        Map<String, Integer> map = new HashMap<>();
        for (String i : splitstrings) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);

            }

        }
        return map;

    }
}
