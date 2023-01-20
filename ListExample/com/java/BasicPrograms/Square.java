package com.java.BasicPrograms;

public class Square {

        public int mySqrt(int x) {
            if (x <= 1) return x;
            long i = 1;
            long sq = i * i;
            while (x >= sq) {
                i++;
                sq = i * i;
            }
            return (int) (i - 1);
        }

    public static void main(String[] args) {
        Square s = new Square();
        int sqrt = s.mySqrt(16);
        System.out.println("sqrt = " + sqrt);
    }
}
