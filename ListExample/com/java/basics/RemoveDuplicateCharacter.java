package com.java.basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

    public static void main(String[] args) {
        String str = "programming";
//        StringBuilder sb = new StringBuilder();
//        str.chars().distinct().forEach(c-> sb.append((char)c));
//        System.out.println("sb = " + sb);

        //approach2 remove duplicate

        StringBuilder sbs = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int idx = str.indexOf(c, i + 1);
            if (idx == -1) {
                sbs.append(c);
            }
        }
        System.out.println("sbs = " + sbs);


        //char array using

        String st = "programmmmmmmmmminggggggg";
        //using to char array
        char[] arr = st.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0;i<arr.length;i++){
            boolean repeat =false;
            for (int j= i+1;j<arr.length;j++){
                if(arr[i] ==arr[j]){
                    repeat= true;
                    break;
                }
            }if (!repeat){
                stringBuilder.append(arr[i]);
            }
        }
        System.out.println("stringBuilder = " + stringBuilder);


        //4th approach.............
//        usign set

        String s = "gauravkumarroy";
        Set<Character> s1 = new LinkedHashSet<>();
        StringBuilder sbbbb = new StringBuilder();

        for (int i =0;i<s.length();i++){
            s1.add(s.charAt(i));
        }
        for (Character c : s1){
            sbbbb.append(c);
        }
        System.out.println("sbbbb = " + sbbbb);



    }
}
