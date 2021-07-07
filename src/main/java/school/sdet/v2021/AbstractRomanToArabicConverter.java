package school.sdet.v2021;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class AbstractRomanToArabicConverter implements RomanToArabicConverter {

    protected Map<String, Integer> MAP;

    public abstract ArabicToRomanConverter getArabicToRomanConverter();

    @Override
    public int convert(String number) throws NotValidNumberException {
        if (MAP == null) {
            MAP = IntStream.rangeClosed(0, 200).boxed().collect(Collectors.toMap((i) -> getArabicToRomanConverter().convert(i), (i) -> i));
        }
        return Optional.ofNullable(MAP.get(number)).orElseThrow(() -> new NotValidNumberException(number));
    }
}
