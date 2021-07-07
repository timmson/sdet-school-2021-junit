package school.sdet.v2021;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

class SimpleRomanCalculator implements RomanCalculator {

    private RomanNumerals romanNumeral;

    public SimpleRomanCalculator(RomanNumerals romanNumeral) {
        this.romanNumeral = romanNumeral;
    }

    @Override
    public String add(String a, String b) {
        return romanNumeral.transform(operation(a, b, Integer::sum));
    }

    @Override
    public String multiply(String a, String b) {
        return romanNumeral.transform(operation(a, b, (i1, i2) -> i1 * i2));
    }

    @Override
    public String subtract(String a, String b) {
        return romanNumeral.transform(operation(a, b, (i1, i2) -> i1 - i2));
    }

    protected int operation(String a, String b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(romanToArabic(a), romanToArabic(b));
    }

    protected int romanToArabic(String number) {
        return IntStream.rangeClosed(0, 200).filter((i) -> romanNumeral.transform(i).equals(number)).findFirst().orElseThrow(() -> new NotValidNumberException(number));
    }
}
