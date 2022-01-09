package com.neutrinosys.java.foundations.solutions.section2_classes_objects.ex8.bank;

public class BankManager {
    public void accessVault(Bank bank) {
        bank.accessVault(); // Perfectly fine here because Manager & Bank are in the same package and Bank.accessVault is package protected
    }
}
