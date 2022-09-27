package com.java.Arrayyyy;

public class FindDuplicateUsingLoop {
    public static void main(String[] args) {
        int [] inputArr = {10,5,10,34,24,24,70,100,100,102,100};
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i+1; j < inputArr.length; j++) {
                if (inputArr[i]==inputArr[j]){
                    System.out.println("duplicate is :"+inputArr[i]);
                }

            }

        }

    }
}
