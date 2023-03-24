package racingcar;

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


        // TODO: 레이스 진행

        // TODO: 우승자 출력
    }
}
