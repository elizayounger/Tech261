package com.sparta.ey;
// Refactoring Reasons: Read, Maintain, Test
public class Program {
    public static void main(String[] args) { // entry point that will run first (methods NOT functions) 
        int timeOfDay = 21; // type, name, value
        getGreeting(timeOfDay);
    }

    private static void getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            System.out.println("Good morning!");
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }
    
}
