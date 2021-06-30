package school.sdet.v2021;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class ObfuscatedRomanNumerals implements RomanNumerals {

    final static Map<Integer, Function<Integer, String>> MAP = new TreeMap<>();

    public ObfuscatedRomanNumerals() {
        MAP.put(1, (n) -> "");
        MAP.put(4, "I"::repeat);
        MAP.put(5, (n) -> "IV");
        MAP.put(9, (n) -> "V" + transform(n - 5));
        MAP.put(10, (n) -> "IX");
        MAP.put(40, (n) -> "X".repeat(n / 10) + transform(n % 10));
        MAP.put(50, (n) -> "XL" + transform(n - 40));
        MAP.put(90, (n) -> "L" + transform(n - 50));
        MAP.put(100, (n) -> "XC" + transform(n - 90));
        MAP.put(200, (n) -> "C" + transform(n - 100));
    }

    @Override
    public String transform(int number) throws NotValidNumberException {
        if (number < 0) {
            throw new NotValidNumberException();
        }

        return MAP.get(MAP.keySet()
                .stream()
                .filter((k) -> k > number)
                .mapToInt(Integer::intValue)
                .min().orElseThrow(NotValidNumberException::new))
                .apply(number);

    }
}
