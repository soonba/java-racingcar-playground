package racingcar;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    final List<Car> carList = new ArrayList<>();

    public Cars(String carString) throws InvalidParameterException{
        parse(carString);
    }

    public void race(int index, int number) {
        Car car = carList.get(index);
        car.run(number);
    }

    public GameResult getResult() {
        GameResult result = new GameResult();
        for (Car car: carList) {
            result.apply(car.print());
        }
        return result;
    }

    public int size() {
        return carList.size();
    }

    private void parse(String carString) throws InvalidParameterException {
        String[] split = carString.split(",");
        for (String s : split) {
            carList.add(new Car(s));
        }
    }

    public List<Car> getWinner() {
        int score = carList.stream()
                        .max(Comparator.comparingInt(Car::getScore))
                        .get()
                        .getScore();
        return carList.stream().filter(car -> car.getScore() == score).collect(Collectors.toList());
    }
}
