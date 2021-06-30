package school.sdet.v2021.task1;

import org.junit.jupiter.api.*;
import school.sdet.v2021.NotValidNumberException;
import school.sdet.v2021.ObfuscatedRomanNumerals;
import school.sdet.v2021.RomanNumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralsShould {

    private RomanNumerals romanNumerals;

    @BeforeAll
    static void beforeAll() {
        System.out.println(" - Preparing anything for all tests at once");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(" - Destroying/closing anything for all tests at once");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println(" -- Preparing anything for all tests before execution of each test");
        romanNumerals = new ObfuscatedRomanNumerals();
    }

    @Test
    void transformToRoman() {
        assertEquals("", romanNumerals.transform(0));
        assertEquals("I", romanNumerals.transform(1));

        assertThrows(NotValidNumberException.class, () -> romanNumerals.transform(-1));
        /**
         * TODO
         *
         *
         * Try your tests here for input 2, 3, 4, 9 ... (see equivalence classes)
         *
         *
         *
         */

    }

    @Test
    void throwNotValidNumberExceptionWhenNumberIsNegative() {

    }

    @AfterEach
    void afterEach() {
        System.out.println(" -- Destroying/closing anything for all tests after execution of each test");
        romanNumerals = null;
    }

}
