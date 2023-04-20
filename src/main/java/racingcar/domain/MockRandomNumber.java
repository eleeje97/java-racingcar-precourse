package racingcar.domain;

public class MockRandomNumber implements RandomNumber {
    private final int randomNumber;

    public MockRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    @Override
    public int getRandomNumber() {
        return randomNumber;
    }

}
