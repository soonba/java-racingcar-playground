package racingcar;

import java.io.IOException;
import java.security.InvalidParameterException;

public class RacingController {

    public static void main(String[] args) throws IOException {

        OutputView.initNames();
        String carNames = InputView.getCarNames();
        try {
            Cars cars = new Cars(carNames);


        OutputView.initTests();
        int raceTime = InputView.getRaceTime();


        for (int i = 0; i < raceTime; i++) {
            races(cars);
            OutputView.printResult(cars);
        }
        OutputView.printWinner(cars);
        } catch (InvalidParameterException e) {
            OutputView.printInvalidParameterException(e);
        }
    }

    private static void races(Cars cars) {
        for (int i = 0; i < cars.size(); i++) {
            cars.race(i,randomGenerator());
        }
    }

    private static Integer randomGenerator() {
        return (int) ((Math.random() * 9));
    }
}
