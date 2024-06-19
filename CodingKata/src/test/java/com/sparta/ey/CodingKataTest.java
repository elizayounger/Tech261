package com.sparta.ey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodingKataTest {

    @Test
    public void testCodingKata1() {
        assertEquals(1024, CodingKata.CodingKata1(new int[]{1, 0, 2, 4}));
        assertEquals(123456, CodingKata.CodingKata1(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(24, CodingKata.CodingKata1(new int[]{0, 0, 2, 4}));
        assertEquals(24, CodingKata.CodingKata1(new int[]{0, 0, -2, 4}));
        assertEquals(0, CodingKata.CodingKata1(new int[]{0}));
        assertEquals(123, CodingKata.CodingKata1(new int[]{1, 2, 3}));
        assertEquals(987654321, CodingKata.CodingKata1(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }

//Gherkin Scenarios: Convert array of integers to a single integer
//    Scenario: Convert a simple array to a single integer
//    Given an array of integers [1, 0, 2, 4]
//    When I convert the array to a single integer
//    Then the result should be 1024
    @DisplayName("Given An Input Of 1024 it returned 1024")
    @Test
    void GivenAnInputOf0024() {
        // Arrange
        int[] input = {1, 0, 2, 4};
        int expected = 1024;
        // Act
        int actual = CodingKata.CodingKata1(input);
        // Assert
        assertEquals(expected, actual);
    }

//Scenario: Convert an array with leading zeros to a single integer
//    Given an array of integers [0, 0, 2, 4]
//    When I convert the array to a single integer
//    Then the result should be 24
    @DisplayName("Given An Input Of 0024 it returned 24")
    @Test
    void GivenAnInputOf0024ItReturned0024() {
        // Arrange
        int[] input = {0, 0, 2, 4};
        int expected = 24;
        // Act
        int actual = CodingKata.CodingKata1(input);
        // Assert
        assertEquals(expected, actual);
    }
//    Scenario: Convert an array with a single element to a single integer
//    Given an array of integers [5]
//    When I convert the array to a single integer
//    Then the result should be 5
    @DisplayName("Given an array of 5 item 1, 2, 3, 4, 5 should return 12345")
    @Test
    void GivenArray5Items12345Returns12345() {
        // Arrange
        int[] input = {1, 2, 3, 4, 5};
        int expected = 12345;
        // Act
        int actual = CodingKata.CodingKata1(input);
        // Assert
        assertEquals(expected, actual);
    }
//    Scenario: Convert an array with all zeros to a single integer
//    Given an array of integers [0, 0, 0, 0]
//    When I convert the array to a single integer
//    Then the result should be 0
    @DisplayName("Given an array of only 0 should return 0")
    @Test
    void GivenArrayOf0sShouldReturn0() {
        // Arrange
        int[] input = {0, 0, 0, 0};
        int expected = 0;
        // Act
        int actual = CodingKata.CodingKata1(input);
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
        int actual = CodingKata.checkNegative(input);
        // Assert
        assertEquals(expected, actual);
    }

}

//    Scenario: Convert an empty array to a single integer
//    Given an empty array of integers []
//    When I convert the array to a single integer
//    Then the result should be 0
//
//
//    Scenario: Convert an array with multiple digits to a single integer
//    Given an array of integers [3, 4, 5, 6, 7]
//    When I convert the array to a single integer
//    Then the result should be 34567

//


//
//package com.sparta.ey;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CodingKataTest {
//

//}
