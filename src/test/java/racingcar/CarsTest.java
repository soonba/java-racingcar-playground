package racingcar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    static Cars testCars;

    @BeforeAll
    static void setup() {
        List<Car> testCarList = new ArrayList<>();
        testCarList.add(new Car("a"));
        testCarList.add(new Car("b"));
        testCarList.add(new Car("c"));
        testCars = new Cars(testCarList);
    }

    @Test
    public void 숫자4_이상만_전진1() {
        Car car = new Car("foo");
        car.run(4);
        assertThat(car.getScore()).isEqualTo(1);
        car.run(3);
        assertThat(car.getScore()).isEqualTo(1);
    }
}
