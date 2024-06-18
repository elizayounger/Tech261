package com.sparta.ey;

//    Given an array of integers, convert them to a single int made up of the digits
//    for example the array:
//    int[] numbers = {1, 0, 2, 4}
//    should return the int 1024.
//    Use TDD and ask if you need any requirements clarified

public class CodingKata {
    public static void main(String[] args) {
//        int[] numbers = {1, 0, 2, 4};
        int[] numbers = {0, 0, 2, 4};
        int result = CodingKata1(numbers);
        System.out.println(result);
    }

    public static Integer CodingKata1(int[] sequence) {
        String concatString = "";
        for (int element : sequence) {
            concatString += String.valueOf(element);
        }
        return Integer.parseInt(concatString);
    }
}

