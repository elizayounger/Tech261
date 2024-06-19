package com.sparta.mg.animals;

public interface Drinkable extends Sleepable {

    public static final int max = 10; //constant
    void drink();
    String goToSleep();

    default void print() {
        printFromInterface();
    }

    private static void printFromInterface() {
        System.out.println("I am printing from an Interface");
    }

    static void doSomething() {
        System.out.println("Static method from an Interface");
    }
    //public, private, default, protected

}
