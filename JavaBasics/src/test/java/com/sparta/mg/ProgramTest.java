package com.sparta.mg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {

    @Test
    @DisplayName("Given a time of 21, then the greeting should be Good Evening")
    void checkThat21GivesGoodEvening() {
        int time = 21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        //Assertions.assertEquals(expectedGreeting, actualGreeting);
        Assertions.assertEquals("Good evening!", Program.getGreeting(21));
    }

    @Test
    @DisplayName("Given a time of 8, greeting returns good morning")
    public void GivenATimeOf8_Greeting_ReturnsGoodMorning()
    {
        // Arrange
        var time = 8;
        var expectedGreeting = "Good morning!";
        // Act
        var result = Program.getGreeting(time);
        // Assert
        Assertions.assertEquals(expectedGreeting, result);
    }
}
