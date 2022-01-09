package com.neutrinosys.java.foundations.solutions.section2_classes_objects.ex9;

public class Customer {
    private String name;
    private float deposit;

    public Customer(String name, float deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Frank", 1234.83f);
    }
}
