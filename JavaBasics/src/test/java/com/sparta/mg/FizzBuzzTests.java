package com.sparta.mg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    // Print numbers in order
    // If the number is divisible by 3 print "Fizz"
    // If the number is divisible by 5 print "Buzz"
    // If it's divisible by both print "FizzBuzz"
    @Test
    void givenAnInputOfOneFizzBuzzReturnsOne() {
        // Arrange
        int input = 1;
        String expected = "1";

        // Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 2",
                "4, 4",
                "7, 7"})
    void givenInputsNotDivisibleByThreeOrFiveFizzBuzzReturnsThatNumber(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void givenAnInputOfThreeFizzBuzzReturnsFizz(int input) {
        String expected = "Fizz";

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }
}
