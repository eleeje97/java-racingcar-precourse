package racingcar.domain;

import racingcar.constants.GameConstants;
import racingcar.constants.ErrorMsg;

public class CarName {
    private String name;

    public CarName(String name) {
        validateLength(name);
        this.name = name;
    }

    private void validateLength(String name) {
        if (name.length() < GameConstants.CAR_NAME_LENGTH_MIN.getNumber()) {
            throw new IllegalArgumentException(ErrorMsg.CAR_NAME_LENGTH_MIN_ERROR.getMsg());
        }

        if (name.length() > GameConstants.CAR_NAME_LENGTH_MAX.getNumber()) {
            throw new IllegalArgumentException(ErrorMsg.CAR_NAME_LENGTH_MAX_ERROR.getMsg());
        }
    }
}
