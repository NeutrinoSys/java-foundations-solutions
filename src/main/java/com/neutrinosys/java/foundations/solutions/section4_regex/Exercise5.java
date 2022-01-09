package com.neutrinosys.java.foundations.solutions.section4_regex;

public class Exercise5 {
    public static void main(String[] args) {
        String email = "jerry.seinfeld@jokes.nbc.com";
        String regex = "\\w+\\.?\\w*@(\\w+\\.)+\\w+"; // allows for jokes.com or jokes.blah.com or jokes.blah.blah.com, etc.
        System.out.println(email.matches(regex));
    }
}
