package school.sdet.v2021;

public class SimpleArabicToRomanConverter implements ArabicToRomanConverter {

    @Override
    public String convert(int number) throws NotValidNumberException {
        if (number < 0 || number > 200) {
            throw new NotValidNumberException(number);
        }

        if (number < 1) {
            return "";
        }

        if (number < 4) {
            return "I".repeat(number);
        }

        if (number < 5) {
            return "IV";
        }

        if (number < 9) {
            return "V" + convert(number - 5);
        }

        if (number < 10) {
            return "IX";
        }

        if (number < 40) {
            return "X".repeat(number / 10) + convert(number % 10);
        }

        if (number < 50) {
            return "XL" + convert(number - 40);
        }

        if (number < 90) {
            return "L" + convert(number - 50);
        }

        if (number < 100) {
            return "XC" + convert(number - 90);
        }

        return "C" + convert(number - 100);
    }
}
