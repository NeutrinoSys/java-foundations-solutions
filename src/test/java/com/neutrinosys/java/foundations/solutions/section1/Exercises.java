package com.neutrinosys.java.foundations.solutions.section1;

import com.neutrinosys.java.foundations.solutions.section1.ex10.NeutrinoMath;
import com.neutrinosys.java.foundations.solutions.section1.ex11.People;
import com.neutrinosys.java.foundations.solutions.section1.ex8.Customer;
import com.neutrinosys.java.foundations.solutions.section1.ex8.bank.Bank;
import com.neutrinosys.java.foundations.solutions.section1.ex8.bank.BankManager;
import com.neutrinosys.java.foundations.solutions.section1.ex9.Ex9Customer;
import org.junit.jupiter.api.Test;

import java.time.Year;

public class Exercises {

    @Test
    public void ex2() {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfWeek.length); // Print # of item in array
        System.out.println(daysOfWeek[3]); // Print 4th day in the array. Note: arrays are zero-based, so 1st item is 0 & 4th item is 3.
    }

    @Test
    public void ex3() {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    }

    @Test
    public void ex4() {
        char[][] ticTacToeBoard = {
                {'O','X','X'},
                {'X','O','O'},
                {'X','O','O'}
        };
        System.out.println(ticTacToeBoard[2][2]); // How would you access the bottom right square?
    }

    @Test
    public void ex5() {
        myMultiInputMethod("one", "two", "three", "four");
        myMultiInputMethod("apple", "orange", "pineapple");
        myMultiInputMethod("Bobby");
    }

    /* A method that allows any number of Strings to be passed as parameter inputs without an array */
    private void myMultiInputMethod(String...args) {}

    @Test
    public void ex6() {
        Example6.mySpecialMethod();
    }

    /* A method contained within a class that does not need to be instantiated to be called */
    class Example6 {
        public static void mySpecialMethod() {
            System.out.println("My special method needs no class instance to run.");
        }
    }

    @Test
    public void ex7() {
        Car myCar = new Car("Tesla", "X", Year.of(2020));
        System.out.println(myCar);
    }

    private class Car {
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
    }

    @Test
    public void ex8() {
        Customer customer = new Customer();
        Bank bank = new Bank();
        BankManager manager = new BankManager();

        customer.accessBankVault(bank); // This way won't work. cmd/ctrl-click on .accessBankVault to see why
        customer.accessBankVault(manager, bank); // This way DOES work because manager IS allowed to access Bank.accessVault()
    }

    @Test
    public void ex9() {
        Ex9Customer customer = new Ex9Customer("Frank", 1234.83f);
        // Ex9Customer customer2 = new Ex9Customer(); // Uncomment this line and you'll get an error because there's not no-arg default constructor for Ex9Customer class
    }

    @Test
    public void ex10() {
        System.out.println(NeutrinoMath.E); // Constants of this sort are typically modeled as a public static final
    }

    @Test
    /**
     * The key here is that the People class stores the three friends in a static field, which causes the friends to be shared
     * amongst all instances of the People class. The use of an array to store the friends allows us to associate a number with
     * each friend.
     */
    public void ex11() {
        People f1 = new People();
        People f2 = new People();
        People f3 = new People();

        System.out.println(f1.getFriends()[0]);
        System.out.println(f1.getFriends()[1]);
        System.out.println(f1.getFriends()[2]);

        System.out.println(f2.getFriends()[0]);
        System.out.println(f2.getFriends()[1]);
        System.out.println(f2.getFriends()[2]);

        System.out.println(f3.getFriends()[0]);
        System.out.println(f3.getFriends()[1]);
        System.out.println(f3.getFriends()[2]);
    }
}
