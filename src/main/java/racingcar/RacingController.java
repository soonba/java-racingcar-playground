package racingcar;

import java.io.IOException;
import java.security.InvalidParameterException;

public class RacingController {

    public void run() throws IOException {
        Cars cars = makeCars();
        OutputView.initTests();
        int raceTime = InputView.getRaceTime();

        for (int i = 0; i < raceTime; i++) {
            races(cars);
            OutputView.printResult(cars);
        }
        OutputView.printWinner(cars);
    }

    private Cars makeCars() throws IOException {
        Cars cars;
        try {
            OutputView.initNames();
            String carNames = InputView.getCarNames();
            cars = new Cars(carNames);
        } catch (InvalidParameterException e) {
            OutputView.printInvalidParameterException(e);
            return makeCars();
        }
        return cars;
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
