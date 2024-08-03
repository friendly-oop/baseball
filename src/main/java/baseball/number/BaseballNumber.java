package baseball.number;

public class BaseballNumber {
    private BaseballNumber() {
    }

    private Digit first;
    private Digit second;
    private Digit third;

    private static final int MAX_INPUT_LENGTH = 3;

    public static BaseballNumber of(String input) {
        if (input.length() != MAX_INPUT_LENGTH) {
            throw new IllegalArgumentException("세 글자를 입력해야 합니다.");
        }

        BaseballNumber baseballNumber = new BaseballNumber();
        baseballNumber.first = Digit.of(input.charAt(0));
        baseballNumber.second = Digit.of(input.charAt(1));
        baseballNumber.third = Digit.of(input.charAt(2));

        return baseballNumber;
    }
}
