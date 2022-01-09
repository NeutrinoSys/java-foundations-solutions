package com.neutrinosys.java.foundations.solutions.section2_classes_objects;

public class Exercise6 {
    public static void mySpecialMethod() {
        System.out.println("My special method needs no class instance to run.");
    }

    public static void main(String[] args) {
        // No need to call "new Exercise6().mySpecialMethod()"
        Exercise6.mySpecialMethod();
    }
}
