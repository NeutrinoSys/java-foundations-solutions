package com.neutrinosys.java.foundations.solutions.section7_testing.ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    public void canConvertCSVToPerson() {
        Person person = Person.convert("Billy, Bob, 1234 Big St., Big City, California, 90210");
        assertEquals(person, new Person("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"));
    }

    @Test
    public void canConvertMultiCSVtoPeople() {
        String multiCSV = "Billy, Bob, 1234 Big St., Big City, California, 90210|Jackson, Joe, 4321 Little St., Little City, New York, 20109";
        Person[] people = Person.convertMulti(multiCSV);
        Person[] expPeople = {
                new Person("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"),
                new Person("Jackson", "Joe", "4321 Little St.", "Little City", "New York", "20109")
        };
        assertArrayEquals(expPeople, people);
    }

}