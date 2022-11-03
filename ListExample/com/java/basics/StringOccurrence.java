package com.java.basics;

import java.util.Arrays;

public class StringOccurrence {
    public static void main(String[] args) {

        String str = "opentextttthghghg";
        char charReplace ='t';
        //expeted output //open1ex2
        //check char present in string or not
        if (str.indexOf(charReplace) == -1){
            System.out.println("given character is not present in input string");
            System.exit(0);
        }

        //1st approch
        //best approach
        int count =1;
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == charReplace){
                str = str.replaceFirst(String.valueOf(charReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);



        //2nd approach

        //logic to replcace char occurrence in string
//        char[] arr = str.toCharArray();//o p e n 1 e x 2
//        int cnt =1;
//        for (int i =00;i<arr.length;i++){
//            if (arr[i]==charReplace){
//                arr[i]=String.valueOf(cnt).charAt(0);
//                cnt++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));


    }
}
