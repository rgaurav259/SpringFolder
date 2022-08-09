package com.java.BasicPrograms;

public class CountNumberEvenOrOdd {
    public static void main(String[] args) {
        int n=2244669;

        int evenCount=0;
        int oddCount=0;

        while (n>0){
          int rem= n%10;
            if (rem % 2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            n=n/10;

        }


        System.out.println("oddCount = " + oddCount);
        System.out.println("evenCount= "+ evenCount);

    }
}
