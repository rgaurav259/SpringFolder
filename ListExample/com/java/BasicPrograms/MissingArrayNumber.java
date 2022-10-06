package com.java.BasicPrograms;

public class MissingArrayNumber {
        public static void main(String args[])
        {
            int[] a = { 1, 2, 4};
            int n = a.length;
                int x1 = a[0];
                int x2 = 1;
                for (int i = 1; i < n; i++)
                    x1 = x1 ^ a[i];

                for (int i = 2; i <= n + 1; i++)
                    x2 = x2 ^ i;
            System.out.println(x1^x2);


        }


}
