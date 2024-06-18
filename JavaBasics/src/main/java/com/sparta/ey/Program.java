package com.sparta.ey;

import java.time.LocalTime;

// Refactoring Reasons: Read, Maintain, Test
public class Program {
    public static void main(String[] args) { // entry point that will run first (methods NOT functions)
//        System.out.println(getGreeting(timeOfDay));
//        LocalTime timeOfDay = LocalTime.now();
//        int timeOfDay = currentTime.getHour();
    }

    public static String getGreeting(int timeOfDay) {
        String greeting;

        // would add function that checks the timeOfDay input here
//        if (checkInput(timeOfDay) == false) {
//            // throw an exception but not sure how to implement
//        }

        if (timeOfDay > 4 && timeOfDay < 12) {
            greeting = "Good morning!";
        } else if (timeOfDay > 11 && timeOfDay < 19) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
    }

//    public static Boolean checkInput(int input) {
//        if (input instanceof String) {
//            return false;
//        }
//        if (input instanceof Integer) {
//            if (input < 0 || input > 23) {
//                return false;
//            }
//        }
//        else {
//            return true;
//        }
//    }
}

//public static String getGreeting(int timeOfDay) { /////////////  ORIGINAL
//    String greeting;
//    if (timeOfDay >= 5 && timeOfDay <= 12) {
//        greeting = "Good morning!";
//    } else if (timeOfDay >= 12 && timeOfDay <= 18) {
//        greeting = "Good afternoon!";
//    } else {
//        greeting = "Good evening!";
//    }
//    return greeting;
//}