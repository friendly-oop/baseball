package baseball.game;

import baseball.game.number.BaseballComputerNumber;
import baseball.game.number.BaseballGameNumber;
import baseball.game.number.BaseballNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class GameCalculatorTest {
    private GameCalculator calculator = new GameCalculator();
    @Test
    @DisplayName("computer와 player 숫자가 같으면 strike를 리턴한다..")
    void makeGameResult_test1() {
        BaseballNumber baseballComputerNumber = new BaseballComputerNumber();
        String computerNumber = baseballComputerNumber.getNumber().stream()
            .map(number -> String.valueOf(number.getNumber()))
            .collect(Collectors.joining(""));
        BaseballNumber baseballGameNumber = BaseballGameNumber.from(computerNumber);
        GameResult result = calculator.makeGameResult(baseballComputerNumber, baseballGameNumber);

        assertAll(
            () -> assertThat(result.isStrikeOut()).isTrue()
        );
    }
}
