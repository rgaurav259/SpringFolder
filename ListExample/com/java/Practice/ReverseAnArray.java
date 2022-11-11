package com.java.Practice;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr ={10,20,50,5,8};

        int first =0;
        int last = arr.length-1;
        while (first < last){
            //swap value of array
            int temp = arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            /* index 0 to 1 increase that's why first++; */
            first++;
            last--;
        }

        for (int swap : arr){
            System.out.print(" "+swap);
        }

    }
}
