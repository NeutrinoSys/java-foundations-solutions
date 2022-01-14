package com.neutrinosys.java.foundations.solutions.section7_testing;

public class Exercise1 {
    public static String alternateCaps(String word) {
        StringBuilder sb = new StringBuilder(word.length()); // Place to store new string as we build it one character at a time
        for (int index=0; index<word.length(); index++) {
            String curLetter = word.substring(index, index+1);
            if (index % 2 == 0) { // Recall '%' - module - enables testing of numerical repeating patterns - every other (every two), every three, every four, etc.
                sb.append(curLetter);
            } else {
                sb.append(curLetter.toUpperCase());
            }
        }
        return sb.toString(); // convert StringBuilder back into our new String
    }
}
