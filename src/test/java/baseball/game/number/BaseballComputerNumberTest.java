package baseball.game.number;

import baseball.game.number.BaseballComputerNumber;
import baseball.game.number.Digit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballComputerNumberTest {
    @Test
    @DisplayName("BaseballComputerNumber 생성자로 객체를 생성하면 각자 다른 숫자가 3개 들어있다.")
    void constructor_test1() {
        BaseballComputerNumber baseballComputerNumber = new BaseballComputerNumber();
        LinkedHashSet<Digit> number = baseballComputerNumber.number;

        assertThat(number.size()).isEqualTo(3);
    }
}