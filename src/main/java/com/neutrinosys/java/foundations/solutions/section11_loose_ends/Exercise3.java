package com.neutrinosys.java.foundations.solutions.section11_loose_ends;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Exercise3 {
    record Person(String firstName, String lastName){}
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jake", "Johnson"));
        people.add(new Person("Jerry", "Smith"));
        people.add(new Person("Mary", "Smith"));
        people.add(null);
        people.add(new Person("Sam", "Jackson"));
        people.add(null);
        people.add(new Person("Sarah", "Doe"));

        for (Person person : people) {
            // Several ways to solve this. You could do what I'm doing below.
            // Or you could wrap each entry in an Optional as you add() to the collection
            // So, you'd end up with a List<Optional<Person>> instead of List<Person>
            System.out.println(Optional.ofNullable(person)
                    .map(Person::firstName)
                    .filter(n -> n.length() > 3) // Exercise 3.1
                    .orElse("Unknown"));
        }
    }
}
