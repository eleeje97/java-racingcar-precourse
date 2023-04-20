package racingcar.domain;

import racingcar.constants.ErrorMsg;

import java.util.*;

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

    public void moveCars(GameRule gameRule) {
        for (RacingCar car : racingCars) {
            car.attemptToMove(gameRule);
        }
    }

    public Map<String, Integer> getCarPositions() {
        Map<String, Integer> carPosition = new LinkedHashMap<>();
        for (RacingCar car : racingCars) {
            carPosition.put(car.getCarName(), car.getMoveCount());
        }
        return carPosition;
    }

    public List<String> pickWinners() {
        Winners winners = new Winners();
        int maxStep = getMaxStep();

        for (RacingCar car : racingCars) {
            winners.pickWinner(car, maxStep);
        }

        return winners.getWinners();
    }

    private int getMaxStep() {
        int maxStep = 0;
        for (RacingCar car : racingCars) {
            maxStep = Integer.max(maxStep, car.getMoveCount());
        }

        return maxStep;
    }

}
