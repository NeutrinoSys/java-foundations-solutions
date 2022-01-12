package com.neutrinosys.java.foundations.solutions.section6_control_flow;

public class Exercise5 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : days) {
            switch (day) {
                case "Sunday":
                    System.out.println("We eat pot roast on Sunday");
                    break;
                case "Monday":
                    System.out.println("We eat spaghetti on Monday");
                    break;
                case "Tuesday":
                    System.out.println("We eat tacos on Tuesday");
                    break;
                case "Wednesday":
                    System.out.println("We eat chicken on Wednesday");
                    break;
                case "Thursday":
                    System.out.println("We eat meatloaf on Thursday");
                    break;
                case "Friday":
                    System.out.println("We eat hamburgers on Friday");
                    break;
                default: // Be careful here with 'default'. We could use default for remaining day of Saturday, OR we could use it in case something other than standard 7 days shows up
                    System.out.println("We eat pizza on Saturday");
                    break;
            }
        }
    }
}
