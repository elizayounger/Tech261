package com.sparta.ey.testscratch;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.sparta.ey.scratch.App.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestApp {

    private Set<Character> expected;
    private Set<Character> actual;

    @BeforeEach
    public void setUp() {
        expected = new HashSet<>();
        actual = new HashSet<>();
    }

    @Test
    public void testCheckLettersOfAlphabetFalse() {
        String input = "abcdefghijklmnopqrstuv";
        assertFalse(checkLettersOfAlphabet(input));
    }

    @Test
    public void testCheckLettersOfAlphabetTrue() {
        String input = "aaabbbcccdefghijkabcdefghijklmnopqrstuvwxyz";
        assertTrue(checkLettersOfAlphabet(input));
    }

    @Test
    public void givenDuplicateAlphabetReturnsSingleSet() {
        String input = "aaabbbcccdefghijkabcdefghijklmnopqrstuvwxyz";
        Character[] charExpected = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        expected.addAll(Arrays.asList(charExpected));
        actual = getInputCharacters(input);
        assertEquals(expected, actual);
    }

    @Test
    public void givenAlphabetReturnsAlphabet() {
        String input = "abcdefghijkabcdefghijklmnopqrstuvwxyz";
        Character[] charExpected = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        expected.addAll(Arrays.asList(charExpected));
        actual = getInputCharacters(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testGeneratesAlphabetList() {
        Character[] charArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Set<Character> expected = new HashSet<>(Arrays.asList(charArray));
        Set<Character> actual = generatesAlphabetList();
        assertEquals(expected, actual);
    }
}
