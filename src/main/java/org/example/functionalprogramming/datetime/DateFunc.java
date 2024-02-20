package org.example.functionalprogramming.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateFunc {
    public static void main(String[] args) {
        /*LocalDate*/
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);

        LocalDate localDate1 = LocalDate.of(2024, 07, 12);
        System.out.println("localDate1 : " + localDate1);
        System.out.println("getMonth : " + localDate1.getMonth());
        System.out.println("getMonthValue : " + localDate1.getMonthValue());
        System.out.println("getDayOfWeek : " + localDate1.getDayOfWeek());
        System.out.println("getDayOfYear : " + localDate1.getDayOfYear());

        System.out.println("\nplusDays : " + localDate1.plusDays(10));
        System.out.println("plusMonths : " + localDate1.plusMonths(2));
        System.out.println("withYear : " + localDate1.withYear(2025));


        LocalDate localDate2 = LocalDate.ofYearDay(2018, 127);
        System.out.println("localDate2 : " + localDate2);

        /*LocalTime*/
        LocalTime localTime = LocalTime.now();
        System.out.println("\nlocalTime : " + localTime);

        /*LocalDateTime*/
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : " + localDateTime);
    }
}
