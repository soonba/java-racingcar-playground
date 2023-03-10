package racingCar.domain;

import java.util.List;

public class Game {
    private final Cars cars;
    private int racingTime;


    public Game(List<Car> carList, int racingTime) {
        this.cars = new Cars(carList);
        this.racingTime = racingTime;
    }

    public void race() {
        cars.race();
        racingTime--;
    }


    public GameResult getResult() {
        return cars.getResult();
    }


    public boolean isEnd() {
        return racingTime == 0;
    }

    public List<Car> findWinners() {
        return cars.findWinners();
    }
}
