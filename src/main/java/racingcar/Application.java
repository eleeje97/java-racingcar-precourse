package racingcar;

import racingcar.constants.GameConstants;
import racingcar.domain.RacingCars;
import racingcar.domain.TrialCount;
import racingcar.view.UIManager;

public class Application {
    public static void main(String[] args) {
        UIManager uiManager = new UIManager();
        RacingCars racingCars = null;
        TrialCount trialCount = null;

        uiManager.printGameStartMsg();
        while (racingCars == null) {
            racingCars = createRacingCars(uiManager.inputCarNames());
        }

        while (trialCount == null) {
            trialCount = createTrialCount(uiManager.inputTrialCount());
        }

        uiManager.printGameResultMsg();
        for (int i = 0; i < GameConstants.getTrialCount(); i++) {
            racingCars.moveCars();
            uiManager.printCarPositions(racingCars.getCarPositions());
        }

        uiManager.printWinners(racingCars.pickWinners());
    }

    public static RacingCars createRacingCars(String userInput) {
        try {
            return new RacingCars(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static TrialCount createTrialCount(String userInput) {
        try {
            return new TrialCount(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
