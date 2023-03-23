package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class UIManager {
    private final ErrorMsgMaker errorMsgMaker;

    public UIManager() {
        errorMsgMaker = new ErrorMsgMaker();
    }

    public void printGameStartMsg() {
        System.out.println("##### GAME START #####");
    }

    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public void inputTryCount() {
    }

    public void printCarSteps() {
    }

    public void printWinners() {
    }
}
