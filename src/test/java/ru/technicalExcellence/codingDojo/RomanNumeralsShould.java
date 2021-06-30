package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralsShould {

    private RomanNumerals romanNumerals;

    @BeforeAll
    static void beforeAll() {
        System.out.println(" - Preparing anything for all tests at once");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println(" -- Preparing anything for all tests before execution of each test");
        romanNumerals = new ObfuscatedRomanNumerals();
    }

    @Test
    void transform0toEmpty() {
        final var number = 0;

        final var result = romanNumerals.transform(number);

        assertEquals("", result);
    }


    @Test
    void transform1toI() {
        final var number = 1;

        final var result = romanNumerals.transform(number);

        assertEquals("I", result);
    }

    /**
     * TODO
     *
     *
     * Try your tests here for input 2, 3, 4, 9 ... (see equivalence classes)
     *
     *
     *
     */


    @Test
    void throwNotValidNumberExceptionWhenNumberIsNegative() {
        final var arrange = -1;

        final Executable action = () -> romanNumerals.transform(arrange);

        assertThrows(NotValidNumberException.class, action);
    }

    @AfterEach
    void afterEach() {
        System.out.println(" -- Destroying/closing anything for all tests after execution of each test");
        romanNumerals = null;
    }

    @AfterAll
    static void afterAll() {
        System.out.println(" - Destroying/closing anything for all tests at once");
    }

}
