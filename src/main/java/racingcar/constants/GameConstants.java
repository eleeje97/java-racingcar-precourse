package racingcar.constants;

public enum GameConstants {
    CAR_NAME_LENGTH_MIN(1),
    CAR_NAME_LENGTH_MAX(5);

    private final int number;

    GameConstants(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
