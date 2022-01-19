package com.neutrinosys.java.foundations.solutions.section8_more_oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

    @Test
    public void convert1() {
        char letter = Exercise5.convert(1);
        assertEquals('a', letter);
    }

    @Test
    public void convert26() {
        char letter = Exercise5.convert(26);
        assertEquals('z', letter);
    }

    @Test
    public void convert23() {
        char letter = Exercise5.convert(23);
        assertEquals('w', letter);
    }

    @Test
    public void convert6() {
        char letter = Exercise5.convert(6);
        assertEquals('f', letter);
    }

    @Test
    public void convert3() {
        char letter = Exercise5.convert(3);
        assertEquals('c', letter);
    }

    @Test
    public void convert8() {
        char letter = Exercise5.convert(8);
        assertEquals('h', letter);
    }
}