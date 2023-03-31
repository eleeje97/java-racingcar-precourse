package racingcar.controller;

import racingcar.constants.GameConstants;
import racingcar.domain.RacingCars;
import racingcar.domain.TrialCount;
import racingcar.view.UIManager;

public class RacingGameController {
    private UIManager uiManager;

    public void run() {
        uiManager = new UIManager();

        uiManager.printGameStartMsg();
        RacingCars racingCars = createRacingCars(uiManager.inputCarNames());
        TrialCount trialCount = createTrialCount(uiManager.inputTrialCount());

        uiManager.printGameResultMsg();
        for (int i = 0; i < trialCount.getCount(); i++) {
            racingCars.moveCars();
            uiManager.printCarPositions(racingCars.getCarPositions());
        }

        uiManager.printWinners(racingCars.pickWinners());
    }

    public RacingCars createRacingCars(String userInput) {
        try {
            return new RacingCars(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return createRacingCars(uiManager.inputCarNames());
        }
    }

    public TrialCount createTrialCount(String userInput) {
        try {
            return new TrialCount(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return createTrialCount(uiManager.inputTrialCount());
        }
    }
}
