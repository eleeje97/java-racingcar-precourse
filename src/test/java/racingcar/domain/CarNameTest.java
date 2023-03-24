package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.constants.ErrorMsg;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {
    @Test
    void 자동차이름_길이범위최소_벗어났을_때() {
        /**
         * Given: carName으로 빈문자열(길이가 0)이 주어졌을 때
         * When: CarName 객체를 생성하면
         * Then: IllegalArgumentException(CAR_NAME_LENGTH_MIN_ERROR)이 발생한다.
         */

        // Given
        String carName = "";

        // When & Then
        assertThatThrownBy(() -> new CarName(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.CAR_NAME_LENGTH_MIN_ERROR.getMsg());
    }

    @Test
    void 자동차이름_길이범위최대_벗어났을_때() {
        /**
         * Given: carName으로 5자를 초과하는 문자열이 주어졌을 때
         * When: CarName 객체를 생성하면
         * Then: IllegalArgumentException(CAR_NAME_LENGTH_MAX_ERROR)이 발생한다.
         */

        // Given
        String carName = "ferrari";

        // When & Then
        assertThatThrownBy(() -> new CarName(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.CAR_NAME_LENGTH_MAX_ERROR.getMsg());
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "abc", "abcde"})
    void 자동차이름_길이범위_정상(String carName) {
        /**
         * Given: carName이 주어졌을 때
         * When: CarName 객체를 생성하면
         * Then: Exception이 발생하지 않는다. (정상적으로 객체가 생성된다.)
         */

        assertThatCode(() -> new CarName(carName))
                .doesNotThrowAnyException();
    }
}
