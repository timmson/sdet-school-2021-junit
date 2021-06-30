package school.sdet.v2021.task2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import school.sdet.v2021.NotValidNumberException;
import school.sdet.v2021.ObfuscatedRomanNumerals;
import school.sdet.v2021.RomanNumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralsShould {

    private RomanNumerals romanNumerals;

    @BeforeEach
    void beforeEach() {
        romanNumerals = new ObfuscatedRomanNumerals();
    }

    @Test
    void transform0ToEmpty() {
        // Arrange
        final var number = 0;

        // Action
        final var result = romanNumerals.transform(number);

        // Assert
        assertEquals("", result);
    }

    /**
     * TODO
     *
     *
     * Try your tests here for input 1, 2, 3, 4, 9 ... (see equivalence classes)
     *
     *
     *
     */


    @Test
    void throwNotValidNumberExceptionWhenNumberIsNegative() {
        // Arrange
        final var arrange = -1;

        // Action
        final Executable action = () -> romanNumerals.transform(arrange);

        // Assert
        assertThrows(NotValidNumberException.class, action);
    }
}
