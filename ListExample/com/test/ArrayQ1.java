package com.test;

public class ArrayQ1 {

    public static void countOccurence(int[] arr, int searchElement){
        int count=0;
        for (int i =0; i< arr.length;i++){
            if(arr[i]==searchElement){
                count++;
            }

        }
        System.out.println("count = " + count);
    }
    //find the last occurence of an element  in the given array;
    public static  void lastOccurenceArray(){
        
    }
    public static void main(String[] args) {
        //count how many 5 is in array
        int[] arr= {1,2,3,4,5,5,4,6,7,8,5};
        int key =5;
        ArrayQ1.countOccurence(arr,key);

    }
}
