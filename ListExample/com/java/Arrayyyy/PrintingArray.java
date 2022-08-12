package com.java.Arrayyyy;

public class PrintingArray {

    public void printarr(int[] arr){
        int n = arr.length;
        for (int i =0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        PrintingArray pr = new PrintingArray();
        pr.printarr(new int[] {10,20,30,40});


    }
}
