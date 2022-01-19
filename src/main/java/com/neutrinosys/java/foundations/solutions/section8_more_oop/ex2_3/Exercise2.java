package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex2_3;

public class Exercise2 {
    public static void main(String[] args) {
        for(DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("We eat %s on %s%n", day.getMeal(), capitalize(day.name()));
        }
    }

    private static String capitalize(String day) {
        String lowercaseDay = day.toLowerCase();
        return lowercaseDay.substring(0,1).toUpperCase() + lowercaseDay.substring(1);
    }
}
