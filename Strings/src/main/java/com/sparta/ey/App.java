package com.sparta.ey;

public class App {
    public static void main(String[] args) {
        String string1 = "Hello"; // creates object in the String pool
        String string2 = "Hello";
        String string3 = new String("Hello"); // creates an object outside the string pool but still in the heap
        String string4 = new String("Hello");
        String string5 = "Hello"; // creates object in the String pool
        String string6 = "Hello";
        String string7 = new String("Hello"); // creates an object outside the string pool but still in the heap
        String string8 = new String("Hello");

        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(string3.hashCode());
        System.out.println(string4.hashCode());
        System.out.println("");
        System.out.println(string1 == string3); // two different objects
        System.out.println(string1.equals(string3)); // the String equals method overrides object equals method so just looks at the strings themselves.
        System.out.println(string1.equals(string3)); // String also has an ovveride for hashcode as well

        System.out.println(System.identityHashCode(string1));
        System.out.println(System.identityHashCode(string2));
        System.out.println(System.identityHashCode(string3));
        System.out.println(System.identityHashCode(string4));
    }
}
