package com.neutrinosys.java.foundations.solutions.section9_collections;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
    // I chose to use a nested record only for less typing
    // You could model Car as a full class, nested or in separate file. Doesn't matter, but more work
    record Car(String make, String model, Year year){}

    public static void main(String[] args) {
        Set<Exercise1.Car> cars = new HashSet<>();
        cars.add(new Exercise1.Car("Tesla", "S", Year.of(2014)));
        cars.add(new Exercise1.Car("Tesla", "X", Year.of(2015)));
        cars.add(new Exercise1.Car("Tesla", "X", Year.of(2015))); // duplicate
        cars.add(new Exercise1.Car("Tesla", "3", Year.of(2016)));
        cars.add(new Exercise1.Car("Tesla", "3", Year.of(2016))); // duplicate
        cars.add(new Exercise1.Car("Tesla", "Y", Year.of(2017)));
        cars.add(new Exercise1.Car("Tesla", "Roadster", Year.of(2009)));

        // should only print out 5 cars still
        for (Exercise1.Car car : cars) {
            System.out.println(car);
        }
    }
}
