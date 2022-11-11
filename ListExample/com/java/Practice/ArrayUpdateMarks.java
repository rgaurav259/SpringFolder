package com.java.Practice;

public class ArrayUpdateMarks {

    public static void updateMarks(int[] arr){
        for (int i = 0;i< arr.length;i++){
           arr[i]=  arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {100,200,300};
        updateMarks(arr);

        //print marks
        for (int marks : arr){
            System.out.println("marks "+marks );
        }


    }
}
