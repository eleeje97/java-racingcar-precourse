package racingcar;

import racingcar.domain.RacingCars;
import racingcar.view.UIManager;

public class Application {
    public static void main(String[] args) {
        UIManager uiManager = new UIManager();
        RacingCars racingCars = null;

        uiManager.printGameStartMsg();
        while (racingCars == null) {
            try {
                racingCars = new RacingCars(uiManager.inputCarNames());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // TODO: 시도할 횟수 입력받기

        // TODO: 레이스 진행

        // TODO: 우승자 출력
    }
}
