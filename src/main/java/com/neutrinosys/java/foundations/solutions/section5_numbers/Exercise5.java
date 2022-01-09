package com.neutrinosys.java.foundations.solutions.section5_numbers;

import java.util.Random;

public class Exercise5 {
    private int sum = 0;

    public int next() {
        this.sum += new Random().nextInt(10);
        return this.sum;
    }

    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
        System.out.println(exercise5.next());
    }
}
