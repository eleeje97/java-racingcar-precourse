package racingcar.constants;

public enum ErrorMsg {
    BLANK_IN_NAME_ERROR("이름에는 공백이 없어야 하며 쉼표(,) 앞뒤에도 공백이 없어야 합니다."),
    CAR_NAME_LENGTH_MIN_ERROR("자동차 이름은 " + GameConstants.CAR_NAME_LENGTH_MIN.getNumber() + "자 이상이어야 합니다."),
    CAR_NAME_LENGTH_MAX_ERROR("자동차 이름은 " + GameConstants.CAR_NAME_LENGTH_MAX.getNumber() + "자 이하여야 합니다.");

    private static final String ERROR_MSG_TAG = "[Error]";
    private final String msg;

    ErrorMsg(String msg) {
        this.msg = ERROR_MSG_TAG + " " + msg + "\n";
    }

    public String getMsg() {
        return msg;
    }

}
