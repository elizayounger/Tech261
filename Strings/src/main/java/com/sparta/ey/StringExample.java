package com.sparta.ey;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "Hello";
        string1.toUpperCase(); // immutable
        string1 = string1.toUpperCase(); // have to store it
        System.out.println(string1);

        String string = String.valueOf(100);
        System.out.println(string);// gives you a value representation of this number
        System.out.println(string1.toCharArray());

        String name = "Manish";
        System.out.println("hello " + name); // this will create 3 strings in memory because strings are immutable.

        // StringBuilder : not a child of string as string is final.
        // Stringbuilder creates the illusion of immutable strings.

        // StringBuffer
    }
}
