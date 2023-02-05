package com.test.Basic;

public class SumOfArray {

    public static void sumArr(int[] arr){
        int sum =0;
        for (int i =0; i< arr.length;i++){
            sum = sum +arr[i];
        }
        System.out.println("sum = " + sum);
    }

    //print even and odd from arrays
    public static  void evenAndOddArrayPrint(int[] arr) {
        System.out.print("Even elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        SumOfArray.sumArr(arr);
        SumOfArray.evenAndOddArrayPrint(arr);

    }
}
