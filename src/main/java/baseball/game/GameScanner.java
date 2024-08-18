package baseball.game;

import baseball.game.number.BaseballGameNumber;
import baseball.game.number.FinishNumber;
import camp.nextstep.edu.missionutils.Console;

public class GameScanner {
    private GameScanner() {}

    public static BaseballGameNumber scanBaseballGameNumber() {
        String input = Console.readLine();
        return BaseballGameNumber.from(input);
    }

    public static FinishNumber scanFinishNumber() {
        String input = Console.readLine();
        return FinishNumber.from(input);
    }
}
