package com.datesandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExamples {

    public static void p(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        /** LocalDate, LocalTime, LocalDateTime and Period objects are immutable just like Strings
         * So they can't be changed
         */

        /** LocalDate */
//        LocalDate now = LocalDate.now();
//        p(now);
//        LocalDate hireDate = LocalDate.of(2008, Month.APRIL, 21);
//        p(hireDate);
//        LocalDate aWeekFromNow = now.plusWeeks(1); p(aWeekFromNow);
//        LocalDate aWeekAgo = now.minusWeeks(1); p(aWeekAgo);
//
//        // But we can change the reference
//        now = now.minusWeeks(1); p(now);
//
//        System.out.println( hireDate.isBefore(now) );


        /** LocalTime */
//        LocalTime now = LocalTime.now();
        // Print format - Hours:Minutes:Seconds:Nano_Seconds
//        p(now);
//        LocalTime timeHired = LocalTime.of(13, 0, 0); p(timeHired);
//        LocalTime anHourFromNow = now.plusHours(1); p(anHourFromNow);
//        LocalTime anHourEarlier = now.minusHours(1); p(anHourEarlier);
//        System.out.println( timeHired.isAfter(now) );


        /** LocalDateTime */
        LocalDateTime now = LocalDateTime.now(); p(now);
        LocalDateTime timeHired = LocalDateTime.of(2008, Month.APRIL, 21, 13, 0, 0);
        p(timeHired);
        System.out.println( now.isBefore(timeHired) );
    }
}