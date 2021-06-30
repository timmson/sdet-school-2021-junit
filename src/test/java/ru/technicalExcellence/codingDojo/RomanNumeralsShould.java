package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {

    @Test
    void transform1toI() {
        assertEquals("I", new RomanNumerals().transform(1));
    }

}
