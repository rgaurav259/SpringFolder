package com.java.Sort;

public class SelectionSort {
    public static void main(String[] args) {

        int[] a ={10,20,1,12,11,5,8,4,85};
        int n= a.length;
        int temp;
        for (int i =0; i<n-1;i++){
            int min =i; //suppose our first elements is min we have to ensure that check each and every iterations

            for (int j=i+1; j<n; j++){
                if (a[j] < a[min]){
                    min=j;
                }
            }
            temp= a[i];
            a[i]= a[min];
            a[min]=temp;
        }
        for (int x: a){
            System.out.print(x +" ");
        }
    }
}
