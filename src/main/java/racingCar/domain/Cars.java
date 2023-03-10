package racingCar.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> findWinners() {
        Position maxPosition = getMaxPosition();
        return getWinnerList(maxPosition);
    }

    private List<Car> getWinnerList(Position maxPosition) {
        return carList.stream().filter(car -> car.isSamePosition(maxPosition)).collect(Collectors.toList());
    }

    private Position getMaxPosition() {
        return carList.stream().max(Comparator.comparingInt(car -> car.getPosition().getValue())).get().getPosition();
    }
}
