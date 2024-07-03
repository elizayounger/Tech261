package com.sparta.ey;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static java.util.function.Predicate.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyOrNullString;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.core.IsEqual.equalTo;

public class HamcrestExampleTests {
    private Sparta eliza;

    @BeforeEach
    void setup() {
        manish = new Spartan(1, "Manish", "Java", LocalDate.of(2000, 1, 1));
    }

    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class hamcrestSpartanTests {
        @Test
        @DisplayName("Check that spartan is called Manish")
        void checkThatSpartanIsCalledManish() {
            assertThat(manish.getName(), Matchers.equalTo("Manish")); // Fluent API
        }

        @Test
        @DisplayName("Check that spartan is called Manish")
        void checkThatSpartanHasAFieldCalledName() {
            assertThat(manish, hasProperty("nam")); // Fluent API
        }

        @Test
        @DisplayName("check that spartan has a field called course set to Java")
        void checkThatSpartanHasAFieldCalledCourseSetTToJava() {
            assertThat(manish, hasProperty("course", equalTo("Java")));
        }
    }

    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamcrestStringMethods {
        @Test
        @DisplayName("Check that name is not empty or null")
        void checkThatNameIsNotEmptyOrNull() {
            assertThat(manish.getName().is(emptyOrNullString()));
        }
    }


}
