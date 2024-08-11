package baseball.game;

import baseball.game.number.BaseballNumber;

public class GameResult {
    private final String BALL = "볼 ";
    private final String STRIKE = "스트라이크";
    private final String NOTHING = "낫싱";

    private int ballCount;
    private int strikeCount;

    private GameResult(int ballCount, int strikeCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public static GameResult makeGameResult(BaseballNumber computer, BaseballNumber player) {
        int ballCount = GameCalculator.countBall(computer, player);
        int strikeCount = GameCalculator.countStrike(computer, player);
        return new GameResult(ballCount, strikeCount);
    }

    public String getGameResult() {
        if (ballCount == 0 && strikeCount == 0) {
            return NOTHING;
        }
        return this.ballCount + BALL + this.strikeCount + STRIKE;
    }

    public boolean isStrikeOut() {
        return this.strikeCount == 3;
    }
}
