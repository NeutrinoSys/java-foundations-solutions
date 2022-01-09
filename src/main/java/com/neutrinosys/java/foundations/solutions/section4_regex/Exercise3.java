package com.neutrinosys.java.foundations.solutions.section4_regex;

public class Exercise3 {
    public static void main(String[] args) {
        String regex2 = "A(?:[bg])racada[bg]ra"; // Can no longer use '\\1' backreference since no longer capturing group
        System.out.println("Abracadabra".matches(regex2));
        System.out.println("Agracadagra".matches(regex2));
    }
}
