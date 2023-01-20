package com.java.Arrayyyy;

public class indexSearchInsert {
        static int searchInsert(int[] a , int target)
        {
            int n = a.length;
            for(int i = 0 ; i < n ; i++)
            {
                if(a[i] >= target)
                    return i;
            }
            return n;
        }
        public static void main(String[] args)
        {
            int[] a = {1 , 3 , 5 , 7 , 9};
            int target = 10;
            System.out.println(searchInsert(a , target));
        }

}
