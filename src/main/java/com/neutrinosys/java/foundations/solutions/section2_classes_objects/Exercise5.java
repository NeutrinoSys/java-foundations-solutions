package com.neutrinosys.java.foundations.solutions.section2_classes_objects;

public class Exercise5 {
    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();
        exercise5.myMultiInputMethod("one", "two", "three", "four");
        exercise5.myMultiInputMethod("apple", "orange", "pineapple");
        exercise5.myMultiInputMethod("Bobby");
    }

    /* A method that allows any number of Strings to be passed as parameter inputs without an array */
    private void myMultiInputMethod(String...args) {}
}
