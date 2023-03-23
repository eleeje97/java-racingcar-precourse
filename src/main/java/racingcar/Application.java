package racingcar;

import racingcar.domain.RacingCars;
import racingcar.view.UIManager;

public class Application {
    public static void main(String[] args) {
        UIManager uiManager = new UIManager();

        uiManager.printGameStartMsg();
        RacingCars racingCars = new RacingCars(uiManager.inputCarNames());


    }
}
