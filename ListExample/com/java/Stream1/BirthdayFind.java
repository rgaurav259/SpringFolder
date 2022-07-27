package com.java.Stream1;

import java.time.LocalDate;
import java.time.Period;

public class BirthdayFind {
    public static void main(String[] args) {
        LocalDate birthday =LocalDate.of(1996,2,10);
        LocalDate today=LocalDate.now();
        Period p =Period.between(birthday,today);
        System.out.printf("Age is %d years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());


        //death day
        LocalDate deathday =LocalDate.of(1996+60,8,28);
        Period p1 =Period.between(today,deathday);
        int d = p1.getYears()*365+p1.getMonths()*30+p1.getDays();

        System.out.printf("\n you will be on earth only %d Days,Hurry Up to do more things",d);

    }
}
