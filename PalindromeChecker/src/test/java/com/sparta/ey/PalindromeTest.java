package com.sparta.ey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    //----------------------------------------------------------------------------
    // findLongestPalindrome Tests

    @Test
    @DisplayName("find Longest Palindrome At End Of String")
    void findLongestPalindromeAtEndOfString() {
        String input = "-M-y- -n-a-m-e- -J-e-f-f10- maallaam";
        String[] expected = {"maallaam"};
        String[] actual = Palindrome.findLongestPalindrome(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("find Longest Palindrome At Start Of String ")
    void findLongestPalindromeAtStartOfString() {
        String input = "my racecar was surely going to be the fastest";
        String[] expected = {"racecar"};
        String[] actual = Palindrome.findLongestPalindrome(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("given Duplicate Palindrome Ignores Duplicate")
    void givenDuplicatePalindromeIgnoresDuplicate() {
        String input = "My racecar was the fastest. My racecar was surely going to be the fastest";
        String[] expected = {"racecar"};
        String[] actual = Palindrome.findLongestPalindrome(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("given two different equal palindromes returns both")
    void givenTwoDifferentEqualPalindromesReturnsBoth() {
        String input = "Did you ever see a level civic rotor rotate";
        String[] expected = {"level", "civic", "rotor"};
        String[] actual = Palindrome.findLongestPalindrome(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    //----------------------------------------------------------------------------
    // givenStringListRemovesNonPalindromes Tests

    @Test
    @DisplayName("Given a string list removes non-palindromes")
    void givenStringListRemovesNonPalindromesTest() {
        String[] input = {"one", "radar", "three", "rotor"};
        String[] expected = {"radar", "rotor"};
        String[] actual = Palindrome.givenStringListRemovesNonPalindromes(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    //----------------------------------------------------------------------------
    // removesDuplicateStringsInArray Tests

    @Test
    @DisplayName("removes one duplicate string in an array")
    void GivenDuplicateStringInArrayRemovesIt() {
        String[] input = {"one", "two", "three", "three"};
        String[] expected = {"one", "two", "three"};
        String[] actual = Palindrome.removesDuplicateStringsInArray(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("removes multiple duplicates string in an array")
    void GivenMultipleDuplicatesStringsInArrayRemoves() {
        String[] input = {"one", "two", "two", "three", "three"};
        String[] expected = {"one", "two", "three"};
        String[] actual = Palindrome.removesDuplicateStringsInArray(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("given array length of 1, returns one element")
    void GivenArrayLengthOneReturnsUnchanged() {
        String[] input = {"one"};
        String[] expected = {"one"};
        String[] actual = Palindrome.removesDuplicateStringsInArray(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    //----------------------------------------------------------------------------
    // findLongestArrayListString Tests

    @Test
    @DisplayName("Given String Array finds longest string")
    void givenStringArrayFindsLongestString() {
        String[] input = {"one", "two", "three", "four"};
        String[] expected = {"three"};
        String[] actual = Palindrome.findLongestArrayListString(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given String Array of equal palindromes returns them all")
    void givenStringArrayOfEqualPalindromesReturnsAll() {
        String[] input = {"civic", "radar", "level", "rotor"};
        String[] expected = {"civic", "radar", "level", "rotor"};
        String[] actual = Palindrome.findLongestArrayListString(input);
        Assertions.assertArrayEquals(expected, actual);
    }


    //----------------------------------------------------------------------------
    // stringToAlphaOnlyList Tests

    @Test
    @DisplayName("Given String Removes non-alphanumerical")
    void givenOnlyAlphanumericalStringReturnsUnchanged() {
        String input = "Testing One Two Three";
        String[] expected = {"Testing", "One", "Two", "Three"};
        String[] actual = Palindrome.stringToAlphaOnlyList(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given String Removes non-alphanumerical")
    void givenStringRemovesAlphanumerical() {
        String input = "-M-y- -n-a-m-e- -J-e-f-f10-";
        String[] expected = {"My", "name", "Jeff"};
        String[] actual = Palindrome.stringToAlphaOnlyList(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given only non-alphanumerical returns empty string")
    void givenOnlyAlphanumericalReturnsEmptyString() {
        String input = "@£$%^&*()";
        String[] expected = {""};
        String[] actual = Palindrome.stringToAlphaOnlyList(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    //----------------------------------------------------------------------------
    // checkStringPalindrome Tests

    // checks whether a string is a palindrome
    @Test
    @DisplayName("given a palindrome racecar")
    void givenPalindromeRacecarReturnsTrue() {
        String input = "racecar";
        boolean expected = true;
        boolean actual = Palindrome.checkStringPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @ DisplayName("given Palindrome Kinnikinnik Returns True")
    void givenPalindromeKinnikinnikReturnsTrue() {
        String input = "kinnikinnik";
        boolean expected = true;
        boolean actual = Palindrome.checkStringPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @ DisplayName("given string less than 3 characters")
    void givenStringLessThan3CharactersFalse() {
        String input = "ab";
        boolean expected = false;
        boolean actual = Palindrome.checkStringPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @ DisplayName("given palindrome of different cases")
    void givenPalindromeOfDifferentCases() {
        String input = "RaCeCaR";
        boolean expected = true;
        boolean actual = Palindrome.checkStringPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @ DisplayName("given null string returns false")
    void givenNullStringReturnsFalse() {
        String input = null;
        boolean expected = false;
        boolean actual = Palindrome.checkStringPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @ DisplayName("given empty string returns false")
    void givenEmptyStringReturnsFalse() {
        String input = "";
        boolean expected = false;
        boolean actual = Palindrome.checkStringPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
}