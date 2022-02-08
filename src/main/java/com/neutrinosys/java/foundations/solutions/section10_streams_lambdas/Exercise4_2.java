package com.neutrinosys.java.foundations.solutions.section10_streams_lambdas;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.Year;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.reducing;

public class Exercise4_2 {
    record Car(String make, String model, Year year, BigDecimal price){}

    public static void main(String[] args) {
        // Just showing an alternative way of creating the stream of cars
        // without first creating an explicity collection/List. This
        // approach is not necessarily better, just an alternative.

        BigDecimal sum = // solution for 4.2
//        String sum = // solution for 4.3
                Stream.of(
                        new Car("Tesla", "S", Year.of(2014), new BigDecimal("90000.99")),
                        new Car("Tesla", "X", Year.of(2015), new BigDecimal("110000.99")),
                        new Car("Tesla", "3", Year.of(2016), new BigDecimal("55000.99")),
                        new Car("Tesla", "Y", Year.of(2017), new BigDecimal("60000.99")),
                        new Car("Tesla", "Roadster", Year.of(2009), new BigDecimal("135000.99")))
                .map(Car::price)

            // solution for 4.2
            .reduce(BigDecimal.ZERO, BigDecimal::add);

            // solution for 4.3
//          .collect(collectingAndThen(reducing(BigDecimal.ZERO, BigDecimal::add), NumberFormat.getCurrencyInstance()::format));
        System.out.println(sum);
    }
}
