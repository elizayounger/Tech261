package com.sparta.mg.static_example;

public class Spartan {
    private static String name;

    // NOT STATIC
    public void setName(String name) {
        Spartan.name = name;
    }

    public String getName() {
        return name;
    }

    // STATIC
    public static void printSpartan(Spartan spartan) {
        System.out.println("Name: " + spartan.getName());
    }
}
