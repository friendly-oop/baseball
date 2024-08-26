package baseball.view;

import baseball.model.BaseballGameNumber;
import baseball.model.FinishNumber;
import camp.nextstep.edu.missionutils.Console;

public class GameScanner {
    private GameScanner() {}

    public static BaseballGameNumber scanBaseballGameNumber() {
        String input = Console.readLine();
        return BaseballGameNumber.of(input);
    }

    public static FinishNumber scanFinishNumber() {
        String input = Console.readLine();
        return FinishNumber.of(input);
    }
}
