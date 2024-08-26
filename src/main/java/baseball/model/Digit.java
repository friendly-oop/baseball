package baseball.model;

import java.util.Objects;

import static baseball.Constant.MAX_CHAR_NUMBER_RANGE;
import static baseball.Constant.MAX_NUMBER_RANGE;
import static baseball.Constant.MIN_CHAR_NUMBER_RANGE;
import static baseball.Constant.MIN_NUMBER_RANGE;

public class Digit {
    private Digit() {
    }

    private static final String INVALID_DIGIT_ERROR_MESSAGE = "숫자[1-9]를 입력해야 합니다.";

    private int number;

    public static Digit of(char ch) {
        if (ch < MIN_CHAR_NUMBER_RANGE || ch > MAX_CHAR_NUMBER_RANGE) {
            throw new IllegalArgumentException(INVALID_DIGIT_ERROR_MESSAGE);
        }

        Digit digit = new Digit();
        digit.number = ch - '0';

        return digit;
    }

    public static Digit of(int num) {
        if (num < MIN_NUMBER_RANGE || num > MAX_NUMBER_RANGE) {
            throw new IllegalArgumentException(INVALID_DIGIT_ERROR_MESSAGE);
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
