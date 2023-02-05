package com.test.Basic;

import javax.sound.sampled.Line;

public class Linear {


    public static void linearSerach(int[] arr){
        int len = arr.length;
        int searchEle= 15;
        boolean flag = false;
        for (int i =0; i<len;i++){
            if(arr[i]==searchEle){
                System.out.println("found at index = " + i);
                flag = true;
                break;
            }

        }
        if(! flag){
            System.out.println("Not Found...");
        }

    }

    public static int binarySearch(int[] arr, int key) {
            int low = 0;
            int hi = arr.length - 1;

            while (low <= hi) {
                int mid = (low + hi) / 2;
                if (key < arr[mid]){
                    hi = mid-1;
                } else if (key > arr[mid]) {
                    low= mid+1;
                }else {

                    return mid;
                }
            }
            return -1;
        }




    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Linear.linearSerach(arr);

        int[] ar ={10,20,30,40,50,60,70,80,90};
        int key =50;
        int result = Linear.binarySearch(ar, key);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
