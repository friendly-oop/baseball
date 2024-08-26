package baseball.controller;

import baseball.model.BaseballNumber;
import baseball.model.Digit;

import java.util.List;

import static baseball.Constant.FIRST_NUMBER_INDEX;
import static baseball.Constant.SECOND_NUMBER_INDEX;
import static baseball.Constant.THIRD_NUMBER_INDEX;

public class GameCalculator {
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

        if (!isEqualsNumber(computerNumber, playerNumber, FIRST_NUMBER_INDEX) && computerNumber.contains(playerNumber.get(FIRST_NUMBER_INDEX))) {
            ballCount++;
        }
        if (!isEqualsNumber(computerNumber, playerNumber, SECOND_NUMBER_INDEX) && computerNumber.contains(playerNumber.get(SECOND_NUMBER_INDEX))) {
            ballCount++;
        }
        if (!isEqualsNumber(computerNumber, playerNumber, THIRD_NUMBER_INDEX) && computerNumber.contains(playerNumber.get(THIRD_NUMBER_INDEX))) {
            ballCount++;
        }

        return ballCount;
    }
}