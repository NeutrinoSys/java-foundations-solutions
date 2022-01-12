package com.neutrinosys.java.foundations.solutions.section6_control_flow;

public class Exercise1 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int day=0; day < days.length; day++) {
            System.out.println(days[day]);
        }

        // Using enhanced for-loop
        for (String day : days) {
            System.out.println(day);
        }

        // Alternating capitalization
        for (int day=0; day < days.length; day++) {
            if (day % 2 == 0) { // Review Numbers section for reminder of how this works
                System.out.println(days[day]);
            } else {
                System.out.println(days[day].toUpperCase());
            }
        }

        // Alternating capitalization - shorter
        for (int day=0; day < days.length; day++) {
            String output = day % 2 == 0 ? days[day] : days[day].toUpperCase();
            System.out.println(output);
        }
    }
}
