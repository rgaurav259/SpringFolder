package com.java.Stream1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeApi {
    //jodatime  api we can call also
    //joda.org 
    
    //if we want to current date and time 
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("localDate = " + localDate); //by default date it will print 
        //now i want to customized order
        int dd = localDate.getDayOfMonth();
        int mm = localDate.getMonthValue();
        int yyyy = localDate.getYear();

        System.out.println(dd+"---"+mm+"---"+yyyy);// i don't want these type

        System.out.println();
        //new way
        System.out.printf("%d-%d-%d",dd,mm,yyyy);// printf not println
//our own customize way
        System.out.println();
        LocalTime localTime=LocalTime.now();
        System.out.println("localTime = " + localTime);
        //localTime = 13:41:33.483204800 last nano second
        
    }
}
