package com.neutrinosys.java.foundations.solutions.section4_regex;

public class Exercise2 {
    public static void main(String[] args) {
        String regex = "A[bg]racada[bg]ra";
        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));

        // Alternatively
        String regex2 = "A([bg])racada\\1ra"; // This would prevent matching Abracadagra - for example
        System.out.println("Abracadabra".matches(regex2));
        System.out.println("Agracadagra".matches(regex2));

    }
}
