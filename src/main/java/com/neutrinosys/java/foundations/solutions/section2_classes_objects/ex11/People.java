package com.neutrinosys.java.foundations.solutions.section2_classes_objects.ex11;

public class People {
    public static final String friends[] = {"Sam", "Jake", "Sarah"};

    public String[] getFriends() {
        return People.friends;
    }

    /**
     * The key here is that the People class stores the three friends in a static field, which causes the friends to be shared
     * amongst all instances of the People class. The use of an array to store the friends allows us to associate a number with
     * each friend.
     */
    public static void main(String[] args) {
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
