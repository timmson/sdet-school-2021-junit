package school.sdet.v2021.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import school.sdet.v2021.ArabicToRomanConverter;
import school.sdet.v2021.SimpleArabicToRomanConverter;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicToRomanConverterShould {

    private ArabicToRomanConverter arabicToRomanConverter;

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
        arabicToRomanConverter = new SimpleArabicToRomanConverter();
    }

    @ParameterizedTest
    @MethodSource("data")
    void transformToRoman(Integer arrange, String expected) {
        final var result = arabicToRomanConverter.convert(arrange);

        assertEquals(expected, result);
    }

}
