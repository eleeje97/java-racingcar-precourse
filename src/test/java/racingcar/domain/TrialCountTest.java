package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.constants.ErrorMsg;
import racingcar.constants.GameConstants;

import static org.assertj.core.api.Assertions.*;

public class TrialCountTest {
    @ParameterizedTest
    @ValueSource(strings = {" ", "five", "오"})
    void 시도횟수_숫자가_아닌_값_입력했을_때(String userInput) {
        /**
         * Given: userInput과 같은 사용자 입력이 주어졌을 때
         * When: TrialCount를 생성하면
         * Then: IllegalArgumentException(TRIAL_COUNT_INPUT_TYPE_ERROR)이 발생한다.
         */

        assertThatThrownBy(() -> new TrialCount(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.TRIAL_COUNT_INPUT_TYPE_ERROR.getMsg());
    }

    @Test
    void 시도횟수_입력값이_빈값일_때() {
        /**
         * Given: userInput으로 빈 값이 주어졌을 때
         * When: TrialCount를 생성하면
         * Then: IllegalArgumentException(TRIAL_COUNT_EMPTY_INPUT_ERROR)이 발생한다.
         */

        // Given
        String userInput = "";

        // When & Then
        assertThatThrownBy(() -> new TrialCount(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.TRIAL_COUNT_EMPTY_INPUT_ERROR.getMsg());
    }

    @Test
    void 시도횟수_입력값이_0일_때() {
        /**
         * Given: userInput으로 "0"이 주어졌을 때
         * When: TrialCount를 생성하면
         * Then: IllegalArgumentException(TRIAL_COUNT_ZERO_ERROR)이 발생한다.
         */

        // Given
        String userInput = "0";

        // When & Then
        assertThatThrownBy(() -> new TrialCount(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMsg.TRIAL_COUNT_ZERO_ERROR.getMsg());

    }

    @ParameterizedTest
    @CsvSource({"'5', 5", "'10', 10", "'1000', 1000"})
    void 시도횟수_입력값_성공(String userInput, int expected) {
        // Given
        // userInput과 같은 사용자 입력이 주어졌을 때

        // When
        TrialCount trialCount = new TrialCount(userInput);

        // Then
        assertThat(trialCount.getCount()).isEqualTo(expected);
    }

}
