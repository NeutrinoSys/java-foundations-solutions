package com.neutrinosys.java.foundations.solutions.section6_control_flow;

public class Exercise7 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int totalChars = 0;
        for (String day : days) {
            totalChars+=day.length();
        }
        System.out.println(totalChars);
    }
}
