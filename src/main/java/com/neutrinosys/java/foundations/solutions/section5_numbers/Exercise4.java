package com.neutrinosys.java.foundations.solutions.section5_numbers;

public class Exercise4 {
    private int[] nums = {13, 49, 90, 130, 175, 181, 255, 310, 330, 359};
    private int currentNumIndex = 0;

    public int next() {
        return nums[currentNumIndex++] / 90;
    }

    public static void main(String[] args) {
        Exercise4 exercise4 = new Exercise4();
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
        System.out.println(exercise4.next());
    }
}
