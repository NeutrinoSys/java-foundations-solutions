package com.neutrinosys.java.foundations.solutions.section10_streams_lambdas;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.Year;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Exercise7 {
    record Car(String make, String model, Year year, BigDecimal price){}

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Tesla", "S", Year.of(2014), new BigDecimal("90000.99")),
                new Car("Tesla", "X", Year.of(2015), new BigDecimal("110000.99")),
                new Car("Tesla", "3", Year.of(2016), new BigDecimal("55000.99")),
                new Car("Tesla", "Y", Year.of(2017), new BigDecimal("60000.99")),
                new Car("Tesla", "Roadster", Year.of(2009), new BigDecimal("135000.99")),
                new Car("Lucid", "Air", Year.of(2021), new BigDecimal("77399.99")),
                new Car("Hyundai", "Ioniq", Year.of(2021), new BigDecimal("34250.00")),
                new Car("Hyundai", "Kona", Year.of(2021), new BigDecimal("38575.00")),
                new Car("Porsche", "Taycan", Year.of(2021), new BigDecimal("81250.00")),
                new Car("Audi", "e-tron", Year.of(2021), new BigDecimal("66995.00")),
                new Car("Volkswagen", "ID.4", Year.of(2021), new BigDecimal("41190"))
        );

        // Exercise 7.1
        Map<String, BigDecimal> sumByMake = cars.stream()
            .collect(groupingBy(
                Car::make,
                reducing(BigDecimal.ZERO, Car::price, BigDecimal::add)));
        System.out.println(sumByMake);

        // Exercise 7.2.1
        Map<String, BigDecimal> averageByMake = cars.stream()
            .collect(groupingBy(
                Car::make,
                teeing(
                    reducing(BigDecimal.ZERO, Car::price, BigDecimal::add),
                    counting(),
                    (sum, count) -> sum.divide(new BigDecimal(count))
                )
            ));
        System.out.println(averageByMake);


        // Exercise 7.2.2
        Map<String, String> formattedAverageByMake = cars.stream()
            .collect(groupingBy(
                Car::make,
                collectingAndThen(teeing(
                    reducing(BigDecimal.ZERO, Car::price, BigDecimal::add),
                    counting(),
                    (sum, count) -> sum.divide(new BigDecimal(count))
                ), NumberFormat.getCurrencyInstance()::format)
            ));
        System.out.println(formattedAverageByMake);


        // Exercise 7.3
        Map<Year, Map<String, Long>> countByYearAndMake = cars.stream()
                .collect(groupingBy(Car::year,
                                groupingBy(Car::make, counting())
                        )
                );
        System.out.println(countByYearAndMake);


        // Exercise 7.4
        Map<String, Integer> countsByMake = new HashMap<>();
        cars.stream()
            .forEach(car -> countsByMake.merge(car.make, 1, Integer::sum));
        System.out.println(countsByMake);
    }

}
