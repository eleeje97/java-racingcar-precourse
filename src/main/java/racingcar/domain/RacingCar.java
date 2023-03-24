package racingcar.domain;

public class RacingCar {
    private CarName carName;
    private int stepCount;

    public RacingCar(String name) {
        this.carName = new CarName(name);
        stepCount = 0;
    }

    public void attemptToMove() {
    }

    private void move() {
    }

}
