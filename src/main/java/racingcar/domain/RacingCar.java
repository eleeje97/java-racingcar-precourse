package racingcar.domain;

import racingcar.constants.GameConstants;

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
        if (canMove(randomNumber)) {
            move();
        }
    }

    private boolean canMove(RandomNumber randomNumber) {
        return randomNumber.getRandomNumber() >= GameConstants.MOVE_BORDER_NUMBER.getNumber();
    }

    private void move() {
        moveCount++;
    }

}
