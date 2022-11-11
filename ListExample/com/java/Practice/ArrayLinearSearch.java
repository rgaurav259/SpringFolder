package com.java.Practice;

public class ArrayLinearSearch {


    public static int linearSearch(int[] arr,int searchKey){

        for (int i = 0; i<arr.length;i++){
            if (arr[i]==searchKey){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        //old way
//        int[] arr = {10,20,30,40,50,60,70,80};
//        int searchArray =30;
//        for (int i =0;i<arr.length;i++){
//            if (arr[i]==searchArray){
//                System.out.print("found at index "+i);
//                return;
//            }
//        }

        int[] arr = {10,20,30,40,50,60,70,80};
        int searchKey =4110;
        int searchIndex = linearSearch(arr, searchKey);
        if (searchIndex==-1){
            System.out.println("NOT found..");
        }else {
            System.out.println("found at index "+searchIndex);
        }


    }
}
