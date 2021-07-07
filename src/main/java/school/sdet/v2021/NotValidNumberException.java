package school.sdet.v2021;

public class NotValidNumberException extends RuntimeException {

    public NotValidNumberException(String number) {
        super(number);
    }

    public NotValidNumberException(int number) {
        super(String.valueOf(number));
    }
}
