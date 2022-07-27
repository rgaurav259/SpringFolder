package com.java.Stream1;

import java.time.LocalTime;

public class TimeCustomized {

    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();

        System.out.println("localTime = " + localTime);
        // i  want customized time order
        int hh = localTime.getHour();
       int mm= localTime.getMinute();
       int ss= localTime.getSecond();
       int nn= localTime.getNano();
       System.out.printf("%d:%d:%d:%d",hh,mm,ss,nn);


    }    
    
}
