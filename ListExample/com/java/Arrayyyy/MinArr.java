package com.java.Arrayyyy;

public class MinArr {
    public int findMin(int[] arr){

        int len = arr.length;
        int min = arr[0];
        for (int i =0; i<len; i++){
            if (arr[i] < min){
                min= arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinArr minArr = new MinArr();
      int minimum = minArr.findMin(new int[] {10,20,1,40,50,60});
        System.out.println("minimum = " + minimum);

    }

}
