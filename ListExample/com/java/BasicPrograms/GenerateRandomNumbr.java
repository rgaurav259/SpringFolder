package com.java.BasicPrograms;

import java.util.Random;

public class GenerateRandomNumbr {
    public static void main(String[] args) {
        Random random = new Random();

        int i = random.nextInt(10000);
        System.out.println(i);

        double v = random.nextDouble();
        System.out.println(v);

        //3rd approach
        System.out.println(Math.random());


    }
}
