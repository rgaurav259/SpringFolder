package com.java.BasicPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxAndMinFromArray {
    public static void main(String[] args) {
        int[] arr = {10,20,40,5,8,1,0,5,4,3,2,80};
        int max=arr[0];
        int min = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        List<Integer> lst = Arrays.asList(1,2,3,5,8,1,0);

        int max1 = Collections.max(lst);
        int min1 = Collections.min(lst);
        System.out.println("min1 = " + min1);
        System.out.println("max1  = " +max1);
    }
}
