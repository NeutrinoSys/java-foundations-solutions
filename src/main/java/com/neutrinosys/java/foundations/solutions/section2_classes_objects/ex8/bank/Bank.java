package com.neutrinosys.java.foundations.solutions.section2_classes_objects.ex8.bank;

public class Bank {
    private String name;

    /* Notice this method does not have public or private keywords (protected would also work). Without those, it is 'package protected'. */
    void accessVault() {
        System.out.println("You're in the vault now");
    }
}
