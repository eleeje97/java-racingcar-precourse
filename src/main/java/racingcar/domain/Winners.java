package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private final List<String> winners;

    public Winners() {
        winners = new ArrayList<>();
    }

    public List<String> getWinners() {
        return winners;
    }

    public void pickWinner(RacingCar car, int maxStep) {
        if (car.getMoveCount() == maxStep) {
            winners.add(car.getCarName());
        }
    }
}
