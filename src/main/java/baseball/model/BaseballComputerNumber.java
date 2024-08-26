package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashSet;

import static baseball.Constant.MAX_INPUT_LENGTH;
import static baseball.Constant.MAX_NUMBER_RANGE;
import static baseball.Constant.MIN_NUMBER_RANGE;

public class BaseballComputerNumber extends BaseballNumber {
    public BaseballComputerNumber() {
        this.number = new LinkedHashSet<>();
        while (number.size() != MAX_INPUT_LENGTH) {
            Digit digit = Digit.of(Randoms.pickNumberInRange(MIN_NUMBER_RANGE, MAX_NUMBER_RANGE));
            this.number.add(digit);
        }
    }
}
