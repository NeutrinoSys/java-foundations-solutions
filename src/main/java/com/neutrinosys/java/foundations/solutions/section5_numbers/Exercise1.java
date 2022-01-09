package com.neutrinosys.java.foundations.solutions.section5_numbers;

public class Exercise1 {
    public static void main(String[] args) {
        // Let H    G    F    E    D    C    B    A  -  be assigned values
        //    128   64   32   16   8    4    2    1
        int signalABC = 1 | 2 | 4; // 7
        int signalAD = 1 | 8; // 9
        int signalADC = 1 | 8 | 4; // 13

        // test if signal D is present in ADC
        System.out.println((13 & 8) == 8); // Logical AND of original signal (13) AND 'D' (8) will equal 8 IF and only IF 'D' was present in original signal
    }
}
