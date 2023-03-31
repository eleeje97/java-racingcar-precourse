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

    public void attemptToMove(RandomNumber randomNumber) {
        GameRule gameRule = new GameRule();
        if (gameRule.canMove(randomNumber)) {
            move();
        }
    }

    private void move() {
        moveCount++;
    }

}
