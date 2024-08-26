package baseball;

import baseball.controller.BaseballGame;

public class Application {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        while(!baseballGame.isEnd()) {
            baseballGame.start();
            baseballGame.play();
            baseballGame.pause();
        }
    }
}
