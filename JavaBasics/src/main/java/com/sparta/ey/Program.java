package com.sparta.ey;
// Refactoring Reasons: Read, Maintain, Test
public class Program {
    public static void main(String[] args) { // entry point that will run first (methods NOT functions) 
        int timeOfDay = 21; // type, name, value
        System.out.println(getGreeting(timeOfDay));
    }

    private static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
    }
}
