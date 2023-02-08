package com.test.newBasic;

public class FindGreatrest {


    //another way
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int  findGreatestinArray(int[] arr){
            for (int i =0; i< arr.length-1;i++){
                for (int j = 0; j<arr.length-1-i;j++)
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]=temp;
                    }

            }

           return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,9,12,45};
//        int greatestinArray = findGreatestinArray(arr);
//        System.out.println("greatestinArray = " + greatestinArray);
        int largest = findLargest(arr);
        System.out.println("largest = " + largest);

    }
}