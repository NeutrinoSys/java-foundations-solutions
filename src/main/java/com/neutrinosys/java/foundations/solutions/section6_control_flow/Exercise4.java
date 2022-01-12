package com.neutrinosys.java.foundations.solutions.section6_control_flow;

public class Exercise4 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : days) {
            if ("Sunday".equals(day)) {
                System.out.println("We eat pot roast on Sunday");
            } else if ("Monday".equals(day)) {
                System.out.println("We eat spaghetti on Monday");
            } else if ("Tuesday".equals(day)) {
                System.out.println("We eat tacos on Tuesday");
            } else if ("Wednesday".equals(day)) {
                System.out.println("We eat chicken on Wednesday");
            } else if ("Thursday".equals(day)) {
                System.out.println("We eat meatloaf on Thursday");
            } else if ("Friday".equals(day)) {
                System.out.println("We eat hamburgers on Friday");
            } else { // technically, no need for another "else if" since there's only one remaining option
                System.out.println("We eat pizza on Saturday");
            }
        }
    }
}
