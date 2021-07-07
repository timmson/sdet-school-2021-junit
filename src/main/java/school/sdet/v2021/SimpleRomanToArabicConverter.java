package school.sdet.v2021;

public class SimpleRomanToArabicConverter extends AbstractRomanToArabicConverter {

    private final ArabicToRomanConverter arabicToRomanConverter;

    public SimpleRomanToArabicConverter(ArabicToRomanConverter arabicToRomanConverter) {
        this.arabicToRomanConverter = arabicToRomanConverter;
    }

    @Override
    public ArabicToRomanConverter getArabicToRomanConverter() {
        return arabicToRomanConverter;
    }
}
