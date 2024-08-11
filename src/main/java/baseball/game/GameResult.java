package baseball.game;

import baseball.game.number.BaseballNumber;

public class GameResult {
    private int ballCount;
    private int strikeCount;

    private GameResult(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public static GameResult makeGameResult(BaseballNumber computer, BaseballNumber player) {
        int ballCount = GameCalculator.countBall(computer, player);
        int strikeCount = GameCalculator.countStrike(computer, player);
        return new GameResult(ballCount, strikeCount);
    }

    public String getGameResult() {
        return this.ballCount + "볼 " + this.strikeCount + "스트라이크";
    }
}
