package baseball.number;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class BaseballGameNumber extends BaseballNumber {
    private BaseballGameNumber() {
    }

    private static final int MAX_INPUT_LENGTH = 3;

    public static BaseballGameNumber of(String input) {
        if (input.length() != MAX_INPUT_LENGTH) {
            throw new IllegalArgumentException("세 글자를 입력해야 합니다.");
        }

        BaseballGameNumber baseballGameNumber = new BaseballGameNumber();
        baseballGameNumber.number = new LinkedHashSet<>(Arrays.asList(
            Digit.of(input.charAt(0)),
            Digit.of(input.charAt(1)),
            Digit.of(input.charAt(2))
        ));

        return baseballGameNumber;
    }
}
