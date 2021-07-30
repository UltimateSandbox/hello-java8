package com.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class HelloDateTimeAPI {

    public static void main(String[] args) {

        LocalDateTime timePoint = LocalDateTime.now();                   // the current date and time
        LocalDate.of(1970, Month.JANUARY, 1);              // from values
        LocalDate.ofEpochDay(150);                                       // middle of 1970
        LocalTime.of(17, 18);
        LocalTime.parse("10:15:30");                                     // from a String

        // years between

        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1967, Month.AUGUST, 12);

        long years = ChronoUnit.YEARS.between(birthday, now);
        long days = ChronoUnit.DAYS.between(birthday, now);

        System.out.println("Years old: " + years);
        System.out.println("Days old: " + days);

        // conversions

        // to Date
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        System.out.println(date);

        // from Date
        Date date2 = new Date();
        LocalDateTime localDateTime2 =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        System.out.println(localDateTime2);

        // date formatting
        System.out.println(localDateTime2.format(DateTimeFormatter.BASIC_ISO_DATE));

    }
}
