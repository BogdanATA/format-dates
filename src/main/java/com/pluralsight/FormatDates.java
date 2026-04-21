package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        // current date
        LocalDate today = LocalDate.now();

        // current date + time
        LocalDateTime now = LocalDateTime.now();

        //current date + time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));


        //print out formated date and time
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(format2));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE MM, yyyy");
        System.out.println(today.format(format3));

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        System.out.println(gmtTime.format(format4));

    }
}
