package school.sdet.v2021;

import java.util.function.BiFunction;

class SimpleRomanCalculator implements RomanCalculator {

    private final ArabicToRomanConverter arabicToRomanConverter;

    private final RomanToArabicConverter romanToArabicConverter;

    public SimpleRomanCalculator(ArabicToRomanConverter arabicToRomanConverter, RomanToArabicConverter romanToArabicConverter) {
        this.arabicToRomanConverter = arabicToRomanConverter;
        this.romanToArabicConverter = romanToArabicConverter;
    }

    @Override
    public String add(String a, String b) {
        return operation(a, b, Integer::sum);
    }

    @Override
    public String multiply(String a, String b) {
        return operation(a, b, (i1, i2) -> i1 * i2);
    }

    @Override
    public String subtract(String a, String b) {
        return operation(a, b, (i1, i2) -> i1 - i2);
    }

    protected String operation(String a, String b, BiFunction<Integer, Integer, Integer> function) {
        return arabicToRomanConverter.convert(function.apply(romanToArabicConverter.convert(a), romanToArabicConverter.convert(b)));
    }

}
