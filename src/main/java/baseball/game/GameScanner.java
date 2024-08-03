package baseball.game;

import baseball.number.BaseballNumber;
import baseball.number.FinishNumber;
import camp.nextstep.edu.missionutils.Console;

public class GameScanner {
    private GameScanner() {}

    public static BaseballNumber scanBaseballNumber() {
        String input = Console.readLine();
        return BaseballNumber.of(input);
    }

    public static FinishNumber scanFinishNumber() {
        String input = Console.readLine();
        return FinishNumber.of(input);
    }
}
