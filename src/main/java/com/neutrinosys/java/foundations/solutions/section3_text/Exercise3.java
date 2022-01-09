package com.neutrinosys.java.foundations.solutions.section3_text;

import java.util.Scanner;

/**
 * You can run this class' main method within IDE normally
 * since it does not use the console()
 * After running, just enter some text at the prompt followed by <enter/return>
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().strip(); // important part here
        System.out.printf("'%s'%n", userInput);
    }

}
