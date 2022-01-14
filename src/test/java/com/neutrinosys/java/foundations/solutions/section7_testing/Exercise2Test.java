package com.neutrinosys.java.foundations.solutions.section7_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class Exercise2Test {

    @Test
    public void canConvertCSVToPerson() {
        Exercise2 person = Exercise2.convert("Billy, Bob, 1234 Big St., Big City, California, 90210");
        assertEquals(person, new Exercise2("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"));
    }

}