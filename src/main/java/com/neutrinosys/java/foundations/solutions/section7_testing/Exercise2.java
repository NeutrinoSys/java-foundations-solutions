package com.neutrinosys.java.foundations.solutions.section7_testing;

import java.util.Objects;

public class Exercise2 {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;

    public Exercise2(String firstName, String lastName, String streetAddress, String city, String state, String zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise2 exercise2 = (Exercise2) o;
        return Objects.equals(firstName, exercise2.firstName) && Objects.equals(lastName, exercise2.lastName) && Objects.equals(streetAddress, exercise2.streetAddress) && Objects.equals(city, exercise2.city) && Objects.equals(state, exercise2.state) && Objects.equals(zipcode, exercise2.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, streetAddress, city, state, zipcode);
    }

    public static Exercise2 convert(String csv) {
        String[] parts = csv.split(",");
        String firstName = parts[0].strip();
        String lastName = parts[1].strip();
        String streetAddress = parts[2].strip();
        String city = parts[3].strip();
        String state = parts[4].strip();
        String zipcode = parts[5].strip();
        return new Exercise2(firstName, lastName, streetAddress, city, state, zipcode);
    }


}
