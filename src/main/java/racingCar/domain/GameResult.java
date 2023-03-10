package racingCar.domain;

public class GameResult {

    private final StringBuilder result = new StringBuilder();

    public void apply(String printString) {
        result.append(printString).append("\n");
    }

    public String getResult() {
        return result.toString();
    }
}
