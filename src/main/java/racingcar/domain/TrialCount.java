package racingcar.domain;

import racingcar.constants.ErrorMsg;

public class TrialCount {
    private final int count;

    public TrialCount(String userInput) {
        validateEmptyInput(userInput);
        validateInputType(userInput);
        count = convertToInt(userInput);
        validateTrialCountZero(count);
    }

    public int getCount() {
        return count;
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
