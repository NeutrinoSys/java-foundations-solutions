package com.neutrinosys.java.foundations.solutions.section4_regex;

public class Exercise1 {
    public static void main(String[] args) {
        String regex = "[DbL]ark";
        String regex2 = "(St|[DbL])ark"; // Exercise 1.1 extra challenge
        System.out.println("Dark".matches(regex));
        System.out.println("bark".matches(regex));
        System.out.println("Lark".matches(regex));

        System.out.println("Stark".matches(regex2));
        System.out.println("Dark".matches(regex2));
        System.out.println("bark".matches(regex2));
        System.out.println("Lark".matches(regex2));
    }
}
