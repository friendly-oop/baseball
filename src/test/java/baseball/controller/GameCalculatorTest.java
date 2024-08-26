package baseball.controller;

import baseball.model.BaseballComputerNumber;
import baseball.model.BaseballGameNumber;
import baseball.model.BaseballNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class GameCalculatorTest {
    @Test
    @DisplayName("computer와 player 숫자가 같으면 3을 리턴한다.")
    void countStrike_test1() {
        BaseballNumber baseballComputerNumber = new BaseballComputerNumber();
        String computerNumber = baseballComputerNumber.getNumber().stream()
            .map(number -> String.valueOf(number.getNumber()))
            .collect(Collectors.joining(""));
        BaseballNumber baseballGameNumber = BaseballGameNumber.of(computerNumber);

        assertThat(GameCalculator.countStrike(baseballComputerNumber, baseballGameNumber)).isEqualTo(3);
    }

    @Test
    @DisplayName("computer와 player 숫자가 같으나 순서가 다르면 3을 리턴한다.")
    void countBall_test1() {
        BaseballNumber baseballComputerNumber = new BaseballComputerNumber();
        String computerNumber = baseballComputerNumber.getNumber().stream()
            .map(number -> String.valueOf(number.getNumber()))
            .collect(Collectors.joining(""));
        BaseballNumber baseballGameNumber = BaseballGameNumber.of(swapFirstAndLast(computerNumber));

        assertThat(GameCalculator.countBall(baseballComputerNumber, baseballGameNumber)).isEqualTo(3);
    }

    private static String swapFirstAndLast(String input) {
        return input.charAt(2) + input.substring(0, 2);
    }
}