package com.neutrinosys.java.foundations.solutions.section11_loose_ends;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Exercise5 {
    public static void main(String[] args) {
        LocalDate independanceDay = LocalDate.of(1776, 7, 4);
        LocalDate today = LocalDate.now();
        Period ageOfUS = Period.between(independanceDay, today);
        System.out.println(ageOfUS);

        // Exercise 5.2
        LocalDate newYear = LocalDate.ofYearDay(2023, 1);
        long daysToNewYear = ChronoUnit.DAYS.between(today, newYear);
        System.out.println(daysToNewYear);

        // Exercise 5.3
        LocalTime activityStart = LocalTime.of(9, 37, 20);
        LocalTime activityStop = LocalTime.of(19, 13, 41);
        Duration activityDuration = Duration.between(activityStart, activityStop);
        System.out.println(activityDuration);
        // Exercise 5.3.1
        System.out.println(activityDuration.toMinutes());

        // Exercise 6
        ZonedDateTime departure = ZonedDateTime.of(2022, 2, 3, 13, 15, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime arrival = ZonedDateTime.of(2022,2,3,20,02,13,0,ZoneId.of("Europe/London"));
        System.out.println(Duration.between(departure, arrival));
        System.out.println(arrival.withZoneSameInstant(ZoneId.of("America/Los_Angeles")));
    }

}
