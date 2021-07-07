package school.sdet.v2021;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class ObfuscatedArabicToRomanConverter implements ArabicToRomanConverter {

    final static Map<Integer, Function<Integer, String>> MAP = new TreeMap<>();

    public ObfuscatedArabicToRomanConverter() {
        MAP.put(1, (n) -> "");
        MAP.put(4, "I"::repeat);
        MAP.put(5, (n) -> "IV");
        MAP.put(9, (n) -> "V" + convert(n - 5));
        MAP.put(10, (n) -> "IX");
        MAP.put(40, (n) -> "X".repeat(n / 10) + convert(n % 10));
        MAP.put(50, (n) -> "XL" + convert(n - 40));
        MAP.put(90, (n) -> "L" + convert(n - 50));
        MAP.put(100, (n) -> "XC" + convert(n - 90));
        MAP.put(200, (n) -> "C" + convert(n - 100));
    }

    @Override
    public String convert(int number) throws NotValidNumberException {
        if (number < 0) {
            throw new NotValidNumberException(number);
        }

        return MAP.get(MAP.keySet()
                .stream()
                .filter((k) -> k > number)
                .mapToInt(Integer::intValue)
                .min().orElseThrow(() -> new NotValidNumberException(number)))
                .apply(number);

    }
}
