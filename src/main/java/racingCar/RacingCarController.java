package racingCar;

import racingCar.domain.Car;
import racingCar.domain.Game;
import racingCar.view.InputView;
import racingCar.view.OutputView;

import java.util.List;

public class RacingCarController {

    public void run() throws Exception {
        List<Car> carList = initCars();

        OutputView.initTimesMessage();
        Integer racingTime = InputView.initTime();

        OutputView.initGameMessage();
        Game game = new Game(carList, racingTime);

        while (!game.isEnd()) {
            game.race();
            OutputView.printResult(game.getResult());
        }
        OutputView.printWinners(game.findWinners());
    }

    private List<Car> initCars() {
        try {
            OutputView.initCarsMessage();
            return InputView.initCars();
        } catch (Exception e) {
            OutputView.printErrorMessage(e.getMessage());
            return initCars();
        }
    }
}
