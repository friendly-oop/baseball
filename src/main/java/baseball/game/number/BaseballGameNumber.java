package baseball.game.number;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class BaseballGameNumber extends BaseballNumber {
    private BaseballGameNumber() {
    }

    private static final int MAX_INPUT_LENGTH = 3;

    public static BaseballGameNumber from(String input) {
        if (input.length() != MAX_INPUT_LENGTH) {
            throw new IllegalArgumentException("세 글자를 입력해야 합니다.");
        }

        BaseballGameNumber baseballGameNumber = new BaseballGameNumber();
        baseballGameNumber.number = new LinkedHashSet<>(Arrays.asList(
            Digit.from(input.charAt(0)),
            Digit.from(input.charAt(1)),
            Digit.from(input.charAt(2))
        ));

        return baseballGameNumber;
    }
}
