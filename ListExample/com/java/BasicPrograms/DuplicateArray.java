package com.java.BasicPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,10};
        boolean flag = false;
        for (int i =0;i< arr.length;i++){
            for (int j =i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    flag= true;
                    System.out.println("found duplicates " +arr[i]);
                }
            }

        }
        if (flag==false){
            System.out.println("duplicates not found");
        }
        //approach 2

        boolean x =false;
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(2);
        integerSet.add(2);
        integerSet.add(3);
        for (Integer value : integerSet){

            if (integerSet.add(value)==false){

                System.out.println("found duplicate"+value);
            }
        }
        if (x==false){
            System.out.println("not found duplicates");
        }
    }
}
