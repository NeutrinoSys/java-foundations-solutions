package com.neutrinosys.java.foundations.solutions.section10_streams_lambdas;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise4 {
    record Car(String make, String model, Year year, int price){}

    public static void main(String[] args) {
        // Just showing an alternative way of creating the stream of cars
        // without first creating an explicity collection/List. This
        // approach is not necessarily better, just an alternative.
        int sum = Stream.of(
                        new Car("Tesla", "S", Year.of(2014), 90000),
                        new Car("Tesla", "X", Year.of(2015), 110000),
                        new Car("Tesla", "3", Year.of(2016), 55000),
                        new Car("Tesla", "Y", Year.of(2017), 60000),
                        new Car("Tesla", "Roadster", Year.of(2009), 135000))
//                .mapToInt(Car::price) // this is first way you could do it
//                .sum(); // first way you could do it
                .collect(Collectors.summingInt(Car::price)); // this is second way you could do it
        System.out.println(sum);
    }
}
