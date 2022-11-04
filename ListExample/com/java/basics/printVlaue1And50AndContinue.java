package com.java.basics;

public class printVlaue1And50AndContinue {
    public static void main(String[] args) {
        //print all the values between 1 and 50 except for the multiple of 3.
//        multiple 3 is 3,6,9,12,..........

        int n =50;
      myloop:  for (int i =0;i<=n;i++){
            if (i%3==0){
                continue myloop;
            }
            System.out.print(i+" ");
        }
    }
}
