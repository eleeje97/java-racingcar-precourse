package racingcar.domain;

import racingcar.constants.ErrorMsg;

public class CarName {
    private static final int CAR_NAME_LENGTH_MIN = 1;
    private static final int CAR_NAME_LENGTH_MAX = 5;
    private final String name;

    public CarName(String name) {
        validateLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateLength(String name) {
        if (name.length() < CAR_NAME_LENGTH_MIN) {
            throw new IllegalArgumentException(ErrorMsg.CAR_NAME_LENGTH_MIN_ERROR.getMsg());
        }

        if (name.length() > CAR_NAME_LENGTH_MAX) {
            throw new IllegalArgumentException(ErrorMsg.CAR_NAME_LENGTH_MAX_ERROR.getMsg());
        }
    }
}
