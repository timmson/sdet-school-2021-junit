package school.sdet.v2021.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import school.sdet.v2021.ObfuscatedRomanNumerals;
import school.sdet.v2021.RomanNumerals;
import school.sdet.v2021.SimpleRomanNumerals;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {

    private RomanNumerals romanNumerals;

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(0, ""),
                Arguments.of(1, "I")
                /**
                 * TODO
                 *
                 * Add another parameters
                 */
        );
    }

    @BeforeEach
    void beforeEach() {
        romanNumerals = new SimpleRomanNumerals();
    }

    @ParameterizedTest
    @MethodSource("data")
    void transformToRoman(Integer arrange, String expected) {
        final var result = romanNumerals.transform(arrange);

        assertEquals(expected, result);
    }

}
