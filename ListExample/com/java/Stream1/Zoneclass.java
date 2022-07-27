package com.java.Stream1;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zoneclass {
    public static void main(String[] args) {
        ZoneId zoneId =ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);
        
        
        // create zone id america los angeles
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(la);
        System.out.println("dt = " + dt);
    }
}
