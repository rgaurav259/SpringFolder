package com.java.Demo;

import java.util.*;

public class MapHashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Chiranjeevi",700);
        m.put("balaih",800);
        m.put("venkatesh",200);
        m.put("nagarjuna",500);
        System.out.println(m);
        System.out.println(m.put("Chiranjeevi",1000));//old value return karta hai
        System.out.println(m);
        Set s = m.keySet();
        System.out.println(s);
        Collection c =m.values();
        System.out.println("value is :" + c);

        Set s1 =m.entrySet();
        System.out.println("s1 = " + s1);

        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+"---> " + m1.getValue());

            if (m1.getKey().equals("nagarjuna")){
                m1.setValue(100000);
            }
            if (m1.getValue().equals(200)){
                m1.setValue(30000);
            }
        }
        System.out.println(m);
    }
}
