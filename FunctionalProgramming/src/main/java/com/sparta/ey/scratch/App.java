package com.sparta.ey.scratch;

import java.util.HashSet;
import java.util.Set;

import static com.sparta.ey.scratch.LoggerSetUp.logger;
import static com.sparta.ey.scratch.LoggerSetUp.loggerSetUp;

public class App {

    public static void main(String[] args) {
        loggerSetUp();
        String input = "abcdefghijklmnopqrstuvwxyz";
        boolean result = checkLettersOfAlphabet(input);
        System.out.println(result);
    }

    public static boolean checkLettersOfAlphabet(String input) {
        Set<Character> alphabet = generatesAlphabetList();
        Set<Character> inputCharacters = getInputCharacters(input);
        boolean result = inputCharacters.equals(alphabet);

        return result;
    }

    public static Set<Character> getInputCharacters(String input) {
        input = input.toUpperCase();
        Set<Character> stringCharacters = new HashSet<>();
        char[] charArray = input.toCharArray();
        for (char letter : charArray) {
            stringCharacters.add(letter);
        }
        return stringCharacters;
    }

    public static Set<Character> generatesAlphabetList() {
        Set<Character> alphabet = new HashSet<>();
        for (Character c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }
        return alphabet;
    }
}