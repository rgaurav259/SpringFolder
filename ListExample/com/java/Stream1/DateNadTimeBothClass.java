package com.java.Stream1;

import java.time.LocalDateTime;

public class DateNadTimeBothClass {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt);

        LocalDateTime localDateTime = dt.plusMonths(6);
        System.out.println("after six montsh date = " + localDateTime);

        LocalDateTime localDateTime1 = dt.plusWeeks(6);
        System.out.println("after six weeks = " + localDateTime1);
        //before six montths

        LocalDateTime localDateTime2 = dt.minusMonths(8);
        System.out.println("before six months = " + localDateTime2);


    }
}
