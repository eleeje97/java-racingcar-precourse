package racingcar.constants;

public enum GameConstants {
    CAR_NAME_LENGTH_MIN(1),
    CAR_NAME_LENGTH_MAX(5),
    RANDOM_NUMBER_RANGE_MIN(1),
    RANDOM_NUMBER_RANGE_MAX(9),
    MOVE_BORDER_NUMBER(4);

    private final int number;

    private static int TRIAL_COUNT;

    GameConstants(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static int getTrialCount() {
        return TRIAL_COUNT;
    }

    public static void setTrialCount(int trialCount) {
        TRIAL_COUNT = trialCount;
    }
}
