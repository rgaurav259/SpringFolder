package com.java.Faq;

public class SearchLinearElementArray {
    public static void main(String[] args) {
        int[] arr ={10,20,40,50,60,70,15,12,7,80,90};
        int search =700;
        boolean flag = false;
        for (int i =0; i<arr.length;i++){
            if (arr[i]==search){
                System.out.println("found at index " +i);
                flag = true;
                break;
            }

        }if (!flag){
            System.out.println("not found at any index");
        }


    }
}
