package ru.technicalExcellence.codingDojo;

import java.util.Map;

class RomanNumerals {

    private final Map<Integer, String> MAP = Map.of(
            1, "I",
            2, "II",
            3, "III",
            4, "IV",
            5, "V",
            6, "VI",
            7, "VII",
            8, "VIII",
            9, "IX"
    );

    public String transform(int number) {
        return MAP.getOrDefault(number, "");
    }
}
