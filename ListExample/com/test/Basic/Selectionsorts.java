package com.test.Basic;

import java.util.Scanner;

public class Selectionsorts {

    public static void selecTionSorts(int[] arr){
        int n = arr.length;
        for (int i =0; i < n-1; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int x : arr){
            System.out.print(" " + x);
        }
    }

    public static void PrimeFactor() {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }
    public static void main(String[] args) {

        Selectionsorts sl = new Selectionsorts();
        //sl.PrimeFactor();



        //calling method
        int[] arr = {9,8,7,6,5,1,3,45,98};

        selecTionSorts(arr);



    }
}
