package baseball.model;

import java.util.Arrays;
import java.util.LinkedHashSet;

import static baseball.Constant.FIRST_NUMBER_INDEX;
import static baseball.Constant.MAX_INPUT_LENGTH;
import static baseball.Constant.SECOND_NUMBER_INDEX;
import static baseball.Constant.THIRD_NUMBER_INDEX;

public class BaseballGameNumber extends BaseballNumber {
    private BaseballGameNumber() {
    }

    private static final String INVALID_NUMBER_ERROR_MESSAGE = "세 글자를 입력해야 합니다.";

    public static BaseballGameNumber of(String input) {
        if (input.length() != MAX_INPUT_LENGTH) {
            throw new IllegalArgumentException(INVALID_NUMBER_ERROR_MESSAGE);
        }

        BaseballGameNumber baseballGameNumber = new BaseballGameNumber();
        baseballGameNumber.number = new LinkedHashSet<>(Arrays.asList(
            Digit.of(input.charAt(FIRST_NUMBER_INDEX)),
            Digit.of(input.charAt(SECOND_NUMBER_INDEX)),
            Digit.of(input.charAt(THIRD_NUMBER_INDEX))
        ));

        return baseballGameNumber;
    }
}
