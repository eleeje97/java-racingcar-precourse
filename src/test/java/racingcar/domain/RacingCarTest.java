package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {
    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar("bmw");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3})
    void 전진시도_실패(int random) {
        // Given
        RandomNumber randomNumber = new MockRandomNumber(random);

        // When
        racingCar.attemptToMove(randomNumber);

        // Then
        assertThat(racingCar.getMoveCount()).isEqualTo(0);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5})
    void 전진시도_성공(int random) {
        // Given
        RandomNumber randomNumber = new MockRandomNumber(random);

        // When
        racingCar.attemptToMove(randomNumber);

        // Then
        assertThat(racingCar.getMoveCount()).isEqualTo(1);
    }
}
