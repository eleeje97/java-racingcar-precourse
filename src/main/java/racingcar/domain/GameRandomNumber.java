package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class GameRandomNumber implements RandomNumber {
    private static final int RANDOM_NUMBER_RANGE_MIN = 1;
    private static final int RANDOM_NUMBER_RANGE_MAX = 9;
    private int randomNumber;

    public GameRandomNumber() {
        this.randomNumber = pickRandomNumber();
    }

    @Override
    public int getRandomNumber() {
        return pickRandomNumber();
    }

    private int pickRandomNumber() {
        return Randoms.pickNumberInRange(RANDOM_NUMBER_RANGE_MIN, RANDOM_NUMBER_RANGE_MAX);
    }
}
