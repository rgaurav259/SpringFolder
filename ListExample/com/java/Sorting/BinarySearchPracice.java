package com.java.Sorting;

public class BinarySearchPracice {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int li=0,hi= arr.length-1;
        int mid =(li+hi)/2;
        int search =40;
        while (li<=hi){
            if (arr[mid]==search){
                System.out.println("element found at index "+mid);
                break;
            } else if (arr[mid] < search) {
                li=mid+1;
            }
            else{
                hi=mid-1;
            }
            mid=(li+hi)/2;
        }
        if (li>hi){
            System.out.println("not found..");
        }
    }
}
