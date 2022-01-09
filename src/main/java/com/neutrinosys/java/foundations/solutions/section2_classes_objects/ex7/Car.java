package com.neutrinosys.java.foundations.solutions.section2_classes_objects.ex7;

import java.time.Year;

public class Car {
    private String make;
    private String model;
    private Year modelYear;

    public Car(String make, String model, Year modelYear) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
    }

    /* The key is to generate a toString() method that prints all the properties */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "X", Year.of(2020));
        System.out.println(myCar);
    }
}
