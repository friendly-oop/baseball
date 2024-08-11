package baseball.game;

import baseball.game.number.BaseballNumber;
import baseball.game.number.Digit;

import java.util.List;

public class GameCalculator {
    private static final int FIRST_NUMBER_INDEX = 0;
    private static final int SECOND_NUMBER_INDEX = 1;
    private static final int THIRD_NUMBER_INDEX = 2;

    public static int countStrike(BaseballNumber computer, BaseballNumber player) {
        int strikeCount = 0;
        List<Digit> computerNumber = computer.getNumber();
        List<Digit> playerNumber = player.getNumber();
        if (isEqualsNumber(computerNumber, playerNumber, FIRST_NUMBER_INDEX)) {
            strikeCount++;
        }
        if (isEqualsNumber(computerNumber, playerNumber, SECOND_NUMBER_INDEX)) {
            strikeCount++;
        }
        if (isEqualsNumber(computerNumber, playerNumber, THIRD_NUMBER_INDEX)) {
            strikeCount++;
        }

        return strikeCount;
    }

    private static boolean isEqualsNumber(List<Digit> computerNumber, List<Digit> playerNumber, int index) {
        return computerNumber.get(index).check(playerNumber.get(index));
    }

    public static int countBall(BaseballNumber computer, BaseballNumber player) {
        int ballCount = 0;
        List<Digit> computerNumber = computer.getNumber();
        List<Digit> playerNumber = player.getNumber();

        if (!isEqualsNumber(computerNumber, playerNumber, FIRST_NUMBER_INDEX) && computerNumber.containsAll(playerNumber)) {
            ballCount++;
        }
        if (!isEqualsNumber(computerNumber, playerNumber, SECOND_NUMBER_INDEX) && computerNumber.containsAll(playerNumber)) {
            ballCount++;
        }
        if (!isEqualsNumber(computerNumber, playerNumber, THIRD_NUMBER_INDEX) && computerNumber.containsAll(playerNumber)) {
            ballCount++;
        }

        return ballCount;
    }
}