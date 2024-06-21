package com.sparta.ey;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdenticalNeighboursTest {
    
    @Test
    void givenAnInputOfLessThan3DigitsReturnFalse() {
        // Arrange
        int[] input = {2, 3};
        boolean expected = false;
        // Act
        boolean actual = IdenticalNeighbours.hasRowOfThree(input);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void givenAnInputOf23334ReturnTrue() {
        // Arrange
        int[] input = {2, 3, 3, 3, 4};
        boolean expected = true;
        // Act
        boolean actual = IdenticalNeighbours.hasRowOfThree(input);
        // Assert
        assertEquals(expected, actual);
    }

    @DisplayName("Given An Input Of 123456789 return false")
    @Test
    void givenAnInputOf123456789ReturnFalse() {
        // Arrange
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean expected = false;
        // Act
        boolean actual = IdenticalNeighbours.hasRowOfThree(input);
        // Assert
        assertEquals(expected, actual);
    }
}
