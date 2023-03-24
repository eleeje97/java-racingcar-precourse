package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constants.GameConstants;

public class GameRandomNumber implements RandomNumber {
    private final int randomNumber;

    public GameRandomNumber() {
        this.randomNumber = pickRandomNumber();
    }

    @Override
    public int getRandomNumber() {
        return randomNumber;
    }

    private int pickRandomNumber() {
        return Randoms.pickNumberInRange(
                GameConstants.RANDOM_NUMBER_RANGE_MIN.getNumber(),
                GameConstants.RANDOM_NUMBER_RANGE_MAX.getNumber()
        );
    }
}
