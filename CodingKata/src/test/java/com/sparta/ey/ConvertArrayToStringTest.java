package com.sparta.ey;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertArrayToStringTest {

    @Test
    public void testCodingKata1() {
        assertEquals(1024, ConvertArrayToString.CodingKata1(new int[]{1, 0, 2, 4}));
        assertEquals(123456, ConvertArrayToString.CodingKata1(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(24, ConvertArrayToString.CodingKata1(new int[]{0, 0, 2, 4}));
        assertEquals(24, ConvertArrayToString.CodingKata1(new int[]{0, 0, -2, 4}));
        assertEquals(0, ConvertArrayToString.CodingKata1(new int[]{0}));
        assertEquals(123, ConvertArrayToString.CodingKata1(new int[]{1, 2, 3}));
        assertEquals(987654321, ConvertArrayToString.CodingKata1(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @DisplayName("Given An Input Of 1024 it returned 1024")
    @Test
    void GivenAnInputOf1024() {
        // Arrange
        int[] input = {1, 0, 2, 4};
        int expected = 1024;
        // Act
        int actual = ConvertArrayToString.CodingKata1(input);
        // Assert
        assertEquals(expected, actual);
    }

    @DisplayName("Given An Input Of 0024 it returned 24")
    @Test
    void GivenAnInputOf0024ItReturned24() {
        // Arrange
        int[] input = {0, 0, 2, 4};
        int expected = 24;
        // Act
        int actual = ConvertArrayToString.CodingKata1(input);
        // Assert
        assertEquals(expected, actual);
    }

    @DisplayName("Given an array of 5 item 1, 2, 3, 4, 5 should return 12345")
    @Test
    void GivenArray5Items12345Returns12345() {
        // Arrange
        int[] input = {1, 2, 3, 4, 5};
        int expected = 12345;
        // Act
        int actual = ConvertArrayToString.CodingKata1(input);
        // Assert
        assertEquals(expected, actual);
    }

    @DisplayName("Given an array of only 0 should return 0")
    @Test
    void GivenArrayOf0sShouldReturn0() {
        // Arrange
        int[] input = {0, 0, 0, 0};
        int expected = 0;
        // Act
        int actual = ConvertArrayToString.CodingKata1(input);
        // Assert
        assertEquals(expected, actual);
    }

    @DisplayName("Checks for negative numbers")
    @Test
    void CheckForNegatives() {
        // arrange
        int input = -1;
        int expected = 1;
        // Act
        int actual = ConvertArrayToString.isNegative(input);
        // Assert
        assertEquals(expected, actual);
    }

}