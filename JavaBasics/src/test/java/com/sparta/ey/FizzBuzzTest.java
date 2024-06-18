package com.sparta.ey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {
    // Print numbers in order
    // if the number is divisible by 3 print "Fizz"
    // if the number is divisible by 5 print "Buzz"
    // If it's divisible by both print "FizzBuzz"

    @DisplayName("Given An Input Of One FizzBuzz Returns One")
    @Test
    void GivenAnInputOfOneFizzBuzzReturnsOne() {
        // Arrange
        int input = 1;
        String expected = "1";

        // Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("given Input Not Divisible By Three Or Five FizzBuzz Returns That Number")
    @ParameterizedTest
    @CsvSource({"2, 2", "4, 4", "7, 7"})
    void givenInputNotDivisibleByThreeOrFiveFizzBussReturnsThatNumber(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("give An Input Of Three Fizz Buzz Returns Fizz")
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void giveAnInputOfThreeFizzBuzzReturnsFizz(int input) {
        String expected = "Fizz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("give An Input Of Three Fizz Buzz Returns Buzz")
    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void giveAnInputOfThreeFizzBuzzReturnsBuzz(int input) {
        String expected = "Buzz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("give An Input Of Three Fizz Buzz Returns FizzBuzz")
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void giveAnInputOfThreeFizzBuzzReturnsFizzBuzz(int input) {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }
}
