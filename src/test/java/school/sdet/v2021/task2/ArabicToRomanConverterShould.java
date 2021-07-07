package school.sdet.v2021.task2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import school.sdet.v2021.NotValidNumberException;
import school.sdet.v2021.ObfuscatedArabicToRomanConverter;
import school.sdet.v2021.ArabicToRomanConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArabicToRomanConverterShould {

    private ArabicToRomanConverter arabicToRomanConverter;

    @BeforeEach
    void beforeEach() {
        arabicToRomanConverter = new ObfuscatedArabicToRomanConverter();
    }

    @Test
    void transform0ToEmpty() {
        // Arrange
        final var number = 0;

        // Action
        final var result = arabicToRomanConverter.convert(number);

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
        final Executable action = () -> arabicToRomanConverter.convert(arrange);

        // Assert
        assertThrows(NotValidNumberException.class, action);
    }
}
