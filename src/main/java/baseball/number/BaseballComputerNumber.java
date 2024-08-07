package baseball.number;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashSet;

public class BaseballComputerNumber extends BaseballNumber {
    private static final int MAX_INPUT_LENGTH = 3;
    private static final int MIN_NUMBER_RANGE = 1;
    private static final int MAX_NUMBER_RANGE = 9;

    public BaseballComputerNumber() {
        this.number = new LinkedHashSet<>();
        while (number.size() != MAX_INPUT_LENGTH) {
            Digit digit = Digit.of(Randoms.pickNumberInRange(MIN_NUMBER_RANGE, MAX_NUMBER_RANGE));
            this.number.add(digit);
        }
    }
}
