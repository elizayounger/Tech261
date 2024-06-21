package com.sparta.ey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Palindrome {
    public static void main(String[] args) {
        String input = "Did you ever see a level civic rotor rotate";
        String[] result = findLongestPalindrome(input);
        for (String element: result) {
            System.out.println(element);
        }
    }

    public static String[] findLongestPalindrome(String input) {
        String[] alphaOnly = stringToAlphaOnlyList(input); // remove extra characters and return list of words
        String[] removeDuplicates = removesDuplicateStringsInArray(alphaOnly); // removed the duplicate items in the list
        String[] removeNonPalindromes = givenStringListRemovesNonPalindromes(removeDuplicates);
        String[] longestPalindromes = findLongestArrayListString(removeNonPalindromes);
        return longestPalindromes;
    }

    public static String[] stringToAlphaOnlyList(String input) {
        // remove any non-alphabetical from string
        String alphaOnly = input.replaceAll("[^a-zA-Z\\s]", "");
        String[] alpha = alphaOnly.split(" ");
        return (alpha);
    }

    public static String[] removesDuplicateStringsInArray(String[] palindromeArray) {
        if (palindromeArray.length < 2) {
            return palindromeArray;
        }
        Set<String> palindromeSet = new LinkedHashSet<String>();
        for (String palindrome : palindromeArray) {
            palindromeSet.add(palindrome);
        }
        String[] result = palindromeSet.toArray(new String[palindromeSet.size()]);
        return result;
    }

    public static String[] givenStringListRemovesNonPalindromes(String[] stringList) {
        ArrayList<String> palindromeList = new ArrayList<String>();
        for (String word: stringList) {
            if (checkStringPalindrome(word)) {
                palindromeList.add(word);
            }
        }
        String[] result = palindromeList.toArray(new String[palindromeList.size()]);
        return result;
    }

    public static boolean checkStringPalindrome(String string) {
        if (string == null || string.isEmpty()) { return false;}
        String lcaseString = string.toLowerCase();
        if (lcaseString.length() < 3) {return false;}

        String reversedString = new StringBuilder(lcaseString).reverse().toString();
        return lcaseString.equals(reversedString);
    }

    public static String[] findLongestArrayListString(String[] stringArray) {
        ArrayList<String> longestWord = new ArrayList<String>();
        int longestWordSize = 0;
        for (String word: stringArray) {
            if (word.length() > longestWordSize) {
                longestWord.clear();
                longestWord.add(word);
                longestWordSize = word.length();
            } else if (word.length() == longestWordSize) {
                longestWord.add(word);
            }
        }
        String[] result = longestWord.toArray(new String[longestWord.size()]);
        return result;
    }
}
