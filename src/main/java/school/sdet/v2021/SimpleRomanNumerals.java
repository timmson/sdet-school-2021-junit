package school.sdet.v2021;

public class SimpleRomanNumerals implements RomanNumerals {

    @Override
    public String transform(int number) throws NotValidNumberException {
        if (number < 0 || number > 200) {
            throw new NotValidNumberException();
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
            return "V" + transform(number - 5);
        }

        if (number < 10) {
            return "IX";
        }

        if (number < 40) {
            return "X".repeat(number / 10) + transform(number % 10);
        }

        if (number < 50) {
            return "XL" + transform(number - 40);
        }

        if (number < 90) {
            return "L" + transform(number - 50);
        }

        if (number < 100) {
            return "XC" + transform(number - 90);
        }

        return "C" + transform(number - 100);
    }
}
