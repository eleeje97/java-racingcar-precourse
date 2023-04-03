package racingcar.domain;

public class GameRule {
    private final int MOVE_BORDER_NUMBER = 4;
    private final RandomNumber randomNumber;
    private final TrialCount trialCount;

    public GameRule(TrialCount trialCount) {
        this.trialCount = trialCount;
        randomNumber = new GameRandomNumber();
    }

    public int getTrialCount() {
        return trialCount.getCount();
    }

    public boolean canMove() {
        return randomNumber.getRandomNumber() >= MOVE_BORDER_NUMBER;
    }
}
