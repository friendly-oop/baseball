package baseball.game;

import baseball.game.number.BaseballComputerNumber;
import baseball.game.number.BaseballNumber;
import baseball.game.number.FinishNumber;

public class BaseballGame {
    private final GamePrinter printer;
    private BaseballNumber computer;
    private FinishNumber finishNumber;

    public BaseballGame() {
        printer = new GamePrinter();
        finishNumber = FinishNumber.NEW_GAME_NUMBER;
    }

    public void start() {
        computer = new BaseballComputerNumber();
        printer.printStartMessage();
    }

    public void play() {
        while(true) {
            printer.printInputMessage();
            BaseballNumber player = GameScanner.scanBaseballGameNumber();

            GameResult result = GameResult.makeGameResult(computer, player);
            printer.printScoreMessage(result);
            if(result.isStrikeOut()) {
                break;
            }
        }
    }

    public void pause() {
        printer.printPauseMessage();
        printer.printEndMessage();
        finishNumber = GameScanner.scanFinishNumber();
    }

    public boolean isEnd() {
        return finishNumber == FinishNumber.END_GAME_NUMBER;
    }
}
