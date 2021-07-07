package school.sdet.v2021;

import java.util.Scanner;

public class ConsoleApp {

    private static final ArabicToRomanConverter ARABIC_TO_ROMAN_CONVERTER = new ObfuscatedArabicToRomanConverter();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number (0-200): ");
            System.out.printf("\nResult: %s\n\n", ARABIC_TO_ROMAN_CONVERTER.convert(scanner.nextInt()));
        }
    }

}
