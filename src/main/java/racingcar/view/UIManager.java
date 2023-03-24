package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Map;

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

    public void printGameResultMsg() {
        System.out.println("실행 결과");
    }

    public void printCarPositions(Map<String, Integer> carPositions) {
        for (String carName : carPositions.keySet()) {
            System.out.println(carName + " : " + getDashExpressionOfCarPosition(carPositions.get(carName)));
        }
        System.out.println();
    }

    private String getDashExpressionOfCarPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }

        return sb.toString();
    }

    public void printWinners() {
    }
}
