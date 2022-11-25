package com.java.InterviewRelated;

public class ArrayProblem1 {

    public static void searchArray(int[] num){

        int search = 20;
        int ans =-1;
        for (int i =0; i<num.length;i++){
            if (num[i]==search){
                ans=i;
                break;
            }
        }
        if (ans ==-1){
            System.out.println("Not found");
        }else {
            System.out.println("found " + search +" at "+ " index " +  ans);

        }

    }

    public static void maximArray(int[] arrNum){
        int maximum = arrNum[0];
        for (int i =1; i< arrNum.length;i++){
            if (arrNum[i] > maximum){
                maximum=arrNum[i];
            }
        }
        System.out.println("maximum = " + maximum);
    }
    public static void minimArray(int[] arrNum){
        int minimum = arrNum[0];
        for (int i =1; i< arrNum.length;i++){
            if (arrNum[i] < minimum){
                minimum =arrNum[i];
            }
        }
        System.out.println("minimum is  = " + minimum);
    }

    public static void main(String[] args) {
        
        int[] arr ={10,20,50,70,80,80,5};

        maximArray(arr);
        minimArray(arr);
        searchArray(arr);
    }
}
