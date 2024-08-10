package baseball.game.number;

public enum FinishNumber {
    NEW_GAME_NUMBER(1),
    END_GAME_NUMBER(2);

    private final int number;

    FinishNumber(int number) {
        this.number = number;
    }

    public static FinishNumber of(String input) {
        switch (input) {
            case "1":
                return NEW_GAME_NUMBER;
            case "2":
                return END_GAME_NUMBER;
            default:
                throw new IllegalArgumentException("1 혹은 2를 입력해야 합니다.");
        }
    }
}
