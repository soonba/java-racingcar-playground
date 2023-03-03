package racingcar;

import racingcar.domain.Game;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.io.IOException;
import java.security.InvalidParameterException;

public class RacingController {

    public void run() throws IOException {
        Game game = makeGame();
        OutputView.initTests();
        int raceTime = InputView.getRaceTime();

        for (int i = 0; i < raceTime; i++) {
            races(game);
            OutputView.printResult(game);
        }
        OutputView.printWinner(game);
    }

    private Game makeGame() throws IOException {
        Game game;
        try {
            OutputView.initNames();
            String carNames = InputView.getCarNames();
            game = new Game(carNames);
        } catch (InvalidParameterException e) {
            OutputView.printInvalidParameterException(e);
            return makeGame();
        }
        return game;
    }

    private static void races(Game game) {
        for (int i = 0; i < game.size(); i++) {
            game.race(i,randomGenerator());
        }
    }

    private static Integer randomGenerator() {
        return (int) ((Math.random() * 9));
    }
}
