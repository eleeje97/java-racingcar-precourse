package racingcar.domain;

public class RacingCar {
    private final CarName carName;
    private int moveCount;

    public RacingCar(String name) {
        this.carName = new CarName(name);
        moveCount = 0;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public String getCarName() {
        return carName.getName();
    }

    public void attemptToMove(GameRule gameRule) {
        if (gameRule.canMove()) {
            move();
        }
    }

    private void move() {
        moveCount++;
    }

}
