package com.java.BasicPrograms;

import java.util.Scanner;

public class PerfectNumber {
        static void nearestPerfectSquare(int N)
        {
                int sr = (int)Math.sqrt(N);
                // Calculate perfect square
                int a = sr * sr;
                int b = (sr + 1) * (sr + 1);
                // Find the nearest
                if ((N - a) < (b - N))
                    System.out.print(a + " ");

                else
                    System.out.print(b + " ");

        }

        public static void main(String[] args) {

        int N =17;

        nearestPerfectSquare(N);

//        System.out.println("Please enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if(n==0 || n==1){
//            System.out.println("perfect number");
//        }else{
//            boolean isPerfect = false;
//            int sqrt = 0;
//            for (int i = 2; i*i <= n; i++) {
//                if (i * i == n) {
//                    isPerfect = true;
//                    sqrt = i;
//                    break;
//                }
//            }
//            if(isPerfect){
//                System.out.println("This no is perfect square of :"+sqrt);
//            }else{
//                System.out.println( n + " is not perfect square");
//            }
//        }


    }


}
