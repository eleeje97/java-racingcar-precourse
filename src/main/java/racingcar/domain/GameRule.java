package racingcar.domain;

public class GameRule {
    private final int MOVE_BORDER_NUMBER = 4;
    private final RandomNumber randomNumber;
    private final TrialCount trialCount;

    public GameRule(TrialCount trialCount, RandomNumber randomNumber) {
        this.trialCount = trialCount;
        this.randomNumber = randomNumber;
    }

    public int getTrialCount() {
        return trialCount.getCount();
    }

    public boolean canMove() {
        return randomNumber.getRandomNumber() >= MOVE_BORDER_NUMBER;
    }
}
