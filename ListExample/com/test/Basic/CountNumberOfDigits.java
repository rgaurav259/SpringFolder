package com.test.Basic;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int n =12345678;
        int count=0;
        int evenCount=0;
        int oddCount=0;
        /* while (n!=0){
            n = n/10;
            count++;
        }
        System.out.println("count of total numbers = " + count);*/

        //now count even and odd count;
        while (n!=0){
            int rem = n%10;
            if(rem %2 == 0){

                evenCount++;
            }else {
                oddCount++;
            }
            n = n/10;
        }
        System.out.println("oddCount = " + oddCount);
        System.out.println("evenCount = " + evenCount);

    }
}
