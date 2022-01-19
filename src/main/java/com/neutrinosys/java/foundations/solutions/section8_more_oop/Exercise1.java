package com.neutrinosys.java.foundations.solutions.section8_more_oop;

import java.util.Random;

public class Exercise1 {
    enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }

        // Exercise 1.1
        for (DayOfWeek day : DayOfWeek.values()) {
            String dayText = day.toString().toLowerCase();
            System.out.println(dayText.substring(0,1).toUpperCase() + dayText.substring(1));
        }

        // Exercise 1.2
        int index = 0;
        for (DayOfWeek day : DayOfWeek.values()) {
            String dayText = day.toString().toLowerCase();
            if (index % 2 == 0) {
                System.out.println(dayText.substring(0, 1).toUpperCase() + dayText.substring(1));
            } else {
                int middleIndex = dayText.length() / 2;
                StringBuilder sb = new StringBuilder();
                sb.append(dayText.substring(0,middleIndex));
                sb.append(dayText.substring(middleIndex, middleIndex+1).toUpperCase());
                sb.append(dayText.substring(middleIndex + 1));
                System.out.println(sb.toString());
            }
            index++;
        }

        // Exercise 1.3
        Random random = new Random();
        for (int counter = 0; counter < 10; counter++) {
            int dayIndex = random.nextInt(7);
            System.out.println(DayOfWeek.values()[dayIndex]);
        }
    }

}
