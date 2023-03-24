package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class UIManager {

    public void printGameStartMsg() {
        System.out.println("##### GAME START #####");
    }

    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public String inputTrialCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Console.readLine();
    }

    public void printCarSteps() {
    }

    public void printWinners() {
    }
}
