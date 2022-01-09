package com.neutrinosys.java.foundations.solutions.section3_text;

public class Exercise4 {
    public static void main(String[] args) {
        String input = "  alphabet ";
        String strippedInput = input.strip();
        String firstPart = strippedInput.substring(0, strippedInput.length() - 1);
        Character lastLetter = strippedInput.charAt(strippedInput.length() - 1);
        // or
//      String lastLetter = strippedInput.substring(strippedInput.length() - 1);
        System.out.println(firstPart + lastLetter.toString().toUpperCase());
    }
}
