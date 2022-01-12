package com.neutrinosys.java.foundations.solutions.section6_control_flow;

public class Exercise2 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int day = 0;
        while (day < days.length) {
            System.out.println(days[day++]);
        }

        // Alternating capitalization
        day = 0;
        while (day < days.length) {
            if (day % 2 == 0) {
                System.out.println(days[day++]);
            } else {
                System.out.println(days[day++].toUpperCase());
            }
        }
        System.out.println("---");

        // Alternating capitalization - shorter
        day = 0;
        while (day < days.length) {
            String output = day % 2 == 0 ? days[day++] : days[day++].toUpperCase();
            System.out.println(output);
        }
    }
}
