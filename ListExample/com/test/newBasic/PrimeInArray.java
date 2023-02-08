package com.test.newBasic;

public class PrimeInArray {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8};
//        ArrayList<Integer> al = new ArrayList<>();
//        for (int x : arr){
//            if (isPrime(x)){
//                al.add(x);
//            }
//        }
//        //now print arraylist
//        for (int a : al){
//            System.out.print(" "+a);
//        }

        int i=0;
        int[] emptyArray = new int[5];
        for (int x : arr) {
            if (isPrime(x)) {
               emptyArray[i]=x;
               i++;
            }
        }
        for (int a : emptyArray) {
            System.out.print(" " + a);
        }
    }
}
