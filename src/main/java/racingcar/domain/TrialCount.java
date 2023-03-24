package racingcar.domain;

import racingcar.constants.ErrorMsg;
import racingcar.constants.GameConstants;

public class TrialCount {
    private int count;

    public TrialCount(String userInput) {
        validateEmptyInput(userInput);
        validateInputType(userInput);
        count = convertToInt(userInput);
        validateTrialCountZero(count);
        GameConstants.setTrialCount(count);
    }

    private int convertToInt(String userInput) {
        return Integer.parseInt(userInput);
    }

    private void validateEmptyInput(String userInput) {
        if (userInput.isEmpty()) {
            throw new IllegalArgumentException(ErrorMsg.TRIAL_COUNT_EMPTY_INPUT_ERROR.getMsg());
        }
    }

    private void validateInputType(String userInput) {
        for (char c : userInput.toCharArray()) {
            validateIsDigit(c);
        }
    }

    private void validateIsDigit(char c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException(ErrorMsg.TRIAL_COUNT_INPUT_TYPE_ERROR.getMsg());
        }
    }

    private void validateTrialCountZero(int trialNumber) {
        if (trialNumber <= 0) {
            throw new IllegalArgumentException(ErrorMsg.TRIAL_COUNT_ZERO_ERROR.getMsg());
        }
    }
}
