package com.sparta.ey;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionalExample {
    public static void main(String[] args) {
        //Something -> Stream
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Leonardo",
                "Michelangelo",
                "Donatello",
                "Raphael"));

        names.stream()
                .map(name -> name.toUpperCase())
                .peek(name -> System.out.println(name))
                .filter(name -> name.contains("O"))
                .forEach(System.out::println);
    }
}
