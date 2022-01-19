package com.neutrinosys.java.foundations.solutions.section8_more_oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise4Test {

    @Test
    public void canConvertA() {
        int num = Exercise4.convert('a');
        assertEquals(1, num);
    }

    @Test
    public void canConvertZ() {
        int num = Exercise4.convert('z');
        assertEquals(26, num);
    }

    @Test
    public void canConvertW() {
        int num = Exercise4.convert('w');
        assertEquals(23, num);
    }

    @Test
    public void canConvertF() {
        int num = Exercise4.convert('f');
        assertEquals(6, num);
    }

    @Test
    public void canConvertC() {
        int num = Exercise4.convert('c');
        assertEquals(3, num);
    }

    @Test
    public void canConvertH() {
        int num = Exercise4.convert('h');
        assertEquals(8, num);
    }

}