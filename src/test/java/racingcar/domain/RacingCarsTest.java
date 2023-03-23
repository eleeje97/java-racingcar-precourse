package racingcar.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.view.ErrorMsg;

import static org.assertj.core.api.Assertions.*;

public class RacingCarsTest {

    @ParameterizedTest
    @ValueSource(strings = {" ", "bmw, jeep, audi", "bmw,jeep, ", " audi"})
    void 자동차이름_공백_입력했을_때(String userInput) {
        /**
         * Given: userInput과 같은 사용자 입력이 주어졌을 때
         * When: RacingCars를 생성하면
         * Then: IllegalArgumentException이 발생한다.
         */

        assertThatThrownBy(() -> new RacingCars(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.BLANK_IN_NAME_ERROR.getMsg());
    }

    @Disabled
    @ParameterizedTest
    @ValueSource(strings = {"", "ferrari", "bmw,ferrari", ",", "audi,"})
    void 자동차이름_길이범위_벗어났을_때(String userInput) {
        // Given

        // When

        // Then
    }

    @Disabled
    @ParameterizedTest
    @ValueSource(strings = {"bmw,jeep,audi", "A,volvo", "benz"})
    void 자동차이름_성공(String userInput) {
        // Given

        // When

        // Then
    }
}
