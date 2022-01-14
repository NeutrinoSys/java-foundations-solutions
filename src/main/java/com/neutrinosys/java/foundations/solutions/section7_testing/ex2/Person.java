package com.neutrinosys.java.foundations.solutions.section7_testing.ex2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;

    public Person(String firstName, String lastName, String streetAddress, String city, String state, String zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public static Person[] convertMulti(String input) {
        // We're splitting on the pipe symbol ' | ', however, that symbol
        // is a special character in regex. The split() method takes input
        // of a regex String. So, we must escape the ' | ' symbol with
        // two backslashes ' \\ ' to tell the regex engine to interpret
        // it literally
        String[] peopleStrings = input.split("\\|");
        Person[] people = new Person[peopleStrings.length];
        for (int index=0; index < peopleStrings.length; index++) {
            people[index] = convert(peopleStrings[index]);
        }
        return people;
    }

    public static Person convert(String csv) {
        String[] parts = csv.split(",");
        String firstName = parts[0].strip();
        String lastName = parts[1].strip();
        String streetAddress = parts[2].strip();
        String city = parts[3].strip();
        String state = parts[4].strip();
        String zipcode = parts[5].strip();
        return new Person(firstName, lastName, streetAddress, city, state, zipcode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(streetAddress, person.streetAddress) && Objects.equals(city, person.city) && Objects.equals(state, person.state) && Objects.equals(zipcode, person.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, streetAddress, city, state, zipcode);
    }

}
