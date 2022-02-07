package com.neutrinosys.java.foundations.solutions.section9_collections;

import java.time.Year;
import java.util.*;

public class Exercise6 {
    record Car(String make, String model, Year year) implements Comparable<Car> {
        @Override
        public int compareTo(Car o) {
            return this.model.compareTo(o.model);
        }
    }

    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        cars.add(new Car("Tesla", "S", Year.of(2014)));
        cars.add(new Car("Tesla", "X", Year.of(2015)));
        cars.add(new Car("Tesla", "X", Year.of(2015))); // duplicate
        cars.add(new Car("Tesla", "3", Year.of(2016)));
        cars.add(new Car("Tesla", "3", Year.of(2016))); // duplicate
        cars.add(new Car("Tesla", "Y", Year.of(2017)));
        cars.add(new Car("Tesla", "Roadster", Year.of(2009)));

        for (Iterator<Car> it = cars.iterator(); it.hasNext();) {
            if (it.next().model().equals(args[0])) {
                it.remove();
            }
        }

        // should only print out 5 cars still
        for (Car car : cars) {
            System.out.println(car);
        }

        // Code for exercise 8
        Car[] carArray = cars.toArray(new Car[0]);
        List<Car> carList = Arrays.asList(carArray);
    }
}
