package racingCar;

import org.junit.jupiter.api.Test;
import racingCar.domain.Car;
import racingCar.domain.Position;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {


    @Test
    void _4이상_전진() {
        Car car = new Car("a");
        car.race(4);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    void _3이하_가만히() {
        Car car = new Car("a");
        car.race(3);
        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }

    @Test
    void 이름은_5자를_초과할수_없음() {
        assertThatThrownBy(() -> new Car("abcdef")).isInstanceOf(IllegalArgumentException.class);
    }
}