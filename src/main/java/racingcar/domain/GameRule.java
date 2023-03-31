package racingcar.domain;

import racingcar.constants.GameConstants;

public class GameRule {
    private final static int MOVE_BORDER_NUMBER = GameConstants.MOVE_BORDER_NUMBER.getNumber();

    public boolean canMove(RandomNumber randomNumber) {
        return randomNumber.getRandomNumber() >= MOVE_BORDER_NUMBER;
    }
}
