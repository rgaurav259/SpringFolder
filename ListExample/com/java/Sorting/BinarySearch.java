package com.java.Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        //array shoul be sorted ,otherwise not applied binary serach
        int[] arr ={10,20,30,40,50,60,70,80,90,100};
        int li =0;
        int hi = arr.length-1;
        int mid = (li+hi)/2;
        int search =10;
        while(li<=hi){
            if(arr[mid] == search){
                System.out.println("value found at index  " + mid );
                break;
            } else if (arr[mid] < search) {
                li=mid+1;
                
            }else {
                hi =mid-1;
            }
            mid=(li+hi)/2;

        }

        if (li>hi){
            System.out.println("not found");
        }
    }
}
