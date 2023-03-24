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
            try {
                racingCars = new RacingCars(uiManager.inputCarNames());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (trialCount == null) {
            try {
                trialCount = new TrialCount(uiManager.inputTrialCount());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        uiManager.printGameResultMsg();
        for (int i = 0; i < GameConstants.getTrialCount(); i++) {
            racingCars.moveCars();
            uiManager.printCarPositions(racingCars.getCarPositions());
        }

        // TODO: 우승자 출력
    }
}
