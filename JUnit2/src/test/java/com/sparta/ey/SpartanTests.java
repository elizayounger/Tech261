package com.sparta.ey;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParamaterizedTest;

import java.time.LocalDate;

public class SpartanTests {

    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME) // Repeats the test x times
    @DisplayName("Are tests even real?")
    void simpleTest() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    @Disabled
    @DisplayName("Check name of Spartan")
    void checkName() {
        Assumptions.assumeFalse(true); //Only run test if the assumption is true
        Assertions.assertEquals(1, 1);
    }
    
    //BeforeAll - once before all tests
    //BeforeEach - before each test
    //AfterAll - once after all tests
    //AfterEach - after each test
    //Can generate with associated name
    private static Spartan kat;
    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        kat = new Spartan(1, "Kat", "Java", LocalDate.now());
        System.out.println(testInfo.getDisplayName());
    }
    @BeforeEach
    void setUp() {

    }
    @AfterAll
    static void afterAll() {

    }

    @AfterEach
    void tearDown() {

    }

}