package racingCar;

import org.junit.jupiter.api.Test;
import racingCar.domain.Car;
import racingCar.domain.Cars;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 레이스_결과() {
        Car a = new Car("a", 2);
        Car b = new Car("b", 3);
        Car c = new Car("c", 3);
        Cars cars = new Cars(Arrays.asList(a, b, c));
        List<Car> winners = cars.findWinners();
        assertThat(winners).containsExactly(b, c);
    }
}
