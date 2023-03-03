package racingcar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.security.InvalidParameterException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    static Car car;

    @BeforeAll
    static void setup() {
        car = new Car("foo");
    }

    @Test
    public void 숫자4_이상만_전진1() {
        car.run(5);
        assertThat(car.print()).isEqualTo("foo : -");
        car.run(3);
        assertThat(car.print()).isEqualTo("foo : -");
        car.run(6);
        assertThat(car.print()).isEqualTo("foo : --");
    }

    @Test
    public void 이름5이하() {
        assertThatThrownBy(() ->
            new Car("asdlkfjasdlfjsdaklfj")).isInstanceOf(InvalidParameterException.class);
    }
}
