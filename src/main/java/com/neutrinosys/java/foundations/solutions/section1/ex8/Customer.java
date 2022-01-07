package com.neutrinosys.java.foundations.solutions.section1.ex8;

import com.neutrinosys.java.foundations.solutions.section1.ex8.bank.Bank;
import com.neutrinosys.java.foundations.solutions.section1.ex8.bank.BankManager;

public class Customer {

    public void accessBankVault(Bank bank) {
//        bank.accessVault(); // If you uncomment this method (remove // from beginning of this line), you'll have an error because bank.accessVault() is package protected & customer is not in the bank package
    }

    public void accessBankVault(BankManager manager, Bank bank) {
        manager.accessVault(bank);
    }
}
