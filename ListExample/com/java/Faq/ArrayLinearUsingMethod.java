package com.java.Faq;

public class ArrayLinearUsingMethod {

    public int searchArray(int[] arr,int serach){
        for (int i =0;i<arr.length;i++){
            if (arr[i]==serach){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayss ={10,20,40,50,82,12,45,455};
        int key =40;
        
        ArrayLinearUsingMethod al = new ArrayLinearUsingMethod();
        int searchIndex = al.searchArray(arrayss, key);

        if (searchIndex == -1){
            System.out.println("NOT found at any index..");
        }else {
            System.out.println("found at index " + searchIndex);
        }
    }
}
