package com.java.Practice;

import java.util.Arrays;

public class SecondLargest{
        static int findSecondLargest(int[] a, int len) {
            Arrays.sort(a);
            int second_largest = 0;
            for (int i = len - 2; i >= 0; i--)
            {
                if (a[i] != a[len - 1])
                {
                    second_largest = a[i];
                    break;
                }
            }
            return second_largest;
        }

        public static void main(String[] args) {
            int[] a = {12,35,1,10,10,34,34,35};
            int len = a.length;

            int answer = findSecondLargest(a, len);

            System.out.println("The second largest element in the array is: " + answer);

        }
    }

