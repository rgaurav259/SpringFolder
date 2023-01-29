package com.test;

import java.util.Arrays;

public class ArrayQ1 {

    public static void countOccurence(int[] arr, int searchElement){
        int count=0;
        for (int i =0; i< arr.length;i++){
            if(arr[i]==searchElement){
                count++;
            }

        }
        System.out.println(" occurrence of " +searchElement +" is =  " + count);
    }
    //find the last occurrence of an element  in the given array;
    public static  void lastOccurenceArray(int[] arr, int searchElement){
        int lastindex = -1;
        for (int i =0; i< arr.length;i++){
            if(arr[i]==searchElement){
                lastindex = i;
            }

        }
        System.out.println("last occurrence of " + searchElement + " index is  = " + lastindex);
    }

    //how many arrays are strictly greater than from input
    public static void strictlyGreater(int[] arr,int searchNums){

        int c = 0;
        for (int i =0; i< arr.length;i++) {
            if (arr[i] > searchNums) {
                c++;
            }
        }
        System.out.println("strictlyGreaterc value is : "+c);

    }

    // check if given array is sorted array or not
    //write a program to check given array is sorted or not
    public static boolean isArraySorted(int[] arr){
        boolean flag = true;
        for (int i =1; i< arr.length; i++){
            if (arr[i] < arr[i-1]){
                //not sorted
                flag=false;
                break;
            }
        }
        return flag;

    }

    //return array smallest and larget like this [1,99];
    public static int[] smallestAndLargest(int[] arr){//lets say array is given {1,2,3,4,5};
         Arrays.sort(arr);
         int[] ans = {arr[0], arr[arr.length-1]}; //first and last value
         return ans;
    }

    //now i want to kth largest and kth smallest
    public static int[] kthsmallestAndLargest(int[] arr,int k){
        Arrays.sort(arr);
        int[] ans = {arr[k-1],arr[arr.length-k]};
        return  ans;
    }

    public static void main(String[] args) {
        //count how many 5 is in array
        int[] arr= {1,4,5,5,4,6,7,8,5};
        int key =5;
        ArrayQ1.countOccurence(arr,key);
        ArrayQ1.lastOccurenceArray(arr,key);
        ArrayQ1.strictlyGreater(arr,key);

        int[] arrs= {1,4,5,5,6,7,8};
        boolean arraySorted = ArrayQ1.isArraySorted(arrs);
        System.out.println("is arraySorted = " + arraySorted);



        int[] ar= {1,9,7,8};
        //first and last elements of array
        int[] valueOfArray = ArrayQ1.smallestAndLargest(ar);
        System.out.println("Arrays.toString(valueOfArray) = " + Arrays.toString(valueOfArray));

        //now i want to kth largest and kth smallest
        int[] a= {1,9,7,8,10,12,24,32};
        int kth = 2;
        //first and last elements of array
        int[] kthvalue = ArrayQ1.kthsmallestAndLargest(a,kth);
        System.out.println("Arrays.toString(valueOfArray) = " + Arrays.toString(kthvalue));

    }
}
