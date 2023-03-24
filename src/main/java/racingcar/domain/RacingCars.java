package racingcar.domain;

import racingcar.constants.ErrorMsg;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private final List<RacingCar> racingCars;

    public RacingCars(String userInput) {
        racingCars = new ArrayList<>();
        createRacingCars(userInput);
    }

    private void createRacingCars(String userInput) {
        if (validateBlank(userInput)) {
            throw new IllegalArgumentException(ErrorMsg.BLANK_IN_NAME_ERROR.getMsg());
        }

        addRacingCars(userInput);
    }

    private void addRacingCars(String userInput) {
        for (String carName : userInput.split(",", -1)) {
            racingCars.add(new RacingCar(carName));
        }
    }

    private boolean validateBlank(String userInput) {
        return userInput.contains(" ");
    }

    public void moveCars() {
        for (RacingCar car : racingCars) {
            RandomNumber randomNumber = new GameRandomNumber();
            car.attemptToMove(randomNumber);
        }
    }

    public void pickWinners() {
    }

}
