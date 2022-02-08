package com.neutrinosys.java.foundations.solutions.section10_streams_lambdas;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Exercise5_1 {
    record Car(String make, String model, Year year){}

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "S", Year.of(2014)));
        cars.add(new Car("Tesla", "X", Year.of(2015)));
        cars.add(new Car("Tesla", "3", Year.of(2016)));
        cars.add(new Car("Tesla", "Y", Year.of(2017)));
        cars.add(new Car("Tesla", "Roadster", Year.of(2009)));

        cars.stream()
                .sorted(
                    comparing(Car::make)        // notice I've statically imported 'comparing' here
                    .thenComparing(Car::model).reversed()
                    .thenComparing(Car::year)
                )
                .forEach(System.out::println);
    }
}
