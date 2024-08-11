package baseball.game.number;

import java.util.Objects;

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

    public boolean check(Digit digit) {
        return this.number == digit.number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Digit digit = (Digit) o;
        return digit.number == this.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
