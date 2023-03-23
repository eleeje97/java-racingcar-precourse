package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private List<RacingCar> racingCars;

    public RacingCars(String carNames) {
        racingCars = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            racingCars.add(new RacingCar(carName));
        }
    }

    public void pickWinners() {
    }

}
