package baseball.game.number;

public class Digit {
    private Digit() {
    }

    private int number;

    public static Digit of(char ch) {
        if (ch < '1' || ch > '9') {
            throw new IllegalArgumentException("숫자[1-9]를 입력해야 합니다.");
        }

        Digit digit = new Digit();
        digit.number = ch - '0';

        return digit;
    }

    public static Digit of(int num) {
        if (num < 1 || num > 9) {
            throw new IllegalArgumentException("숫자[1-9]를 입력해야 합니다.");
        }

        Digit digit = new Digit();
        digit.number = num;

        return digit;
    }

    public boolean check(int number) {
        return this.number == number;
    }
}
