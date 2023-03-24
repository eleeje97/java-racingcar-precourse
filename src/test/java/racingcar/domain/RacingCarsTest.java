package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.constants.ErrorMsg;

import static org.assertj.core.api.Assertions.*;

public class RacingCarsTest {

    @ParameterizedTest
    @ValueSource(strings = {" ", "bmw, jeep, audi", "bmw,jeep, ", " audi"})
    void 자동차이름_공백_입력했을_때(String userInput) {
        /**
         * Given: userInput과 같은 사용자 입력이 주어졌을 때
         * When: RacingCars를 생성하면
         * Then: IllegalArgumentException(BLANK_IN_NAME_ERROR)이 발생한다.
         */

        assertThatThrownBy(() -> new RacingCars(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.BLANK_IN_NAME_ERROR.getMsg());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", ",", "audi,", ",,", "bmw,,audi"})
    void 자동차이름_길이범위최소_벗어났을_때(String userInput) {
        /**
         * Given: userInput과 같은 사용자 입력이 주어졌을 때
         * When: RacingCars를 생성하면
         * Then: IllegalArgumentException(CAR_NAME_LENGTH_MIN_ERROR)이 발생한다.
         */

        assertThatThrownBy(() -> new RacingCars(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.CAR_NAME_LENGTH_MIN_ERROR.getMsg());
    }

    @ParameterizedTest
    @ValueSource(strings = {"ferrari", "bmw,ferrari", "ferrari,,"})
    void 자동차이름_길이범위최대_벗어났을_때(String userInput) {
        /**
         * Given: userInput과 같은 사용자 입력이 주어졌을 때
         * When: RacingCars를 생성하면
         * Then: IllegalArgumentException(CAR_NAME_LENGTH_MAX_ERROR)이 발생한다.
         */

        assertThatThrownBy(() -> new RacingCars(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.CAR_NAME_LENGTH_MAX_ERROR.getMsg());
    }

    @ParameterizedTest
    @ValueSource(strings = {"bmw,jeep,audi", "A,volvo", "benz"})
    void 자동차이름_성공(String userInput) {
        /**
         * Given: userInput과 같은 사용자 입력이 주어졌을 때
         * When: RacingCars를 생성하면
         * Then: Exception이 발생하지 않는다. (정상적으로 객체가 생성된다.)
         */

        assertThatCode(() -> new RacingCars(userInput))
                .doesNotThrowAnyException();
    }

    @Test
    void 우승자_선정_테스트() {

    }
}
