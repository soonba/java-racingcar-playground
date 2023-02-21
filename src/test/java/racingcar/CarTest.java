package racingcar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

        car.run(4);
        assertThat(car.getScore()).isEqualTo(1);
        car.run(3);
        assertThat(car.getScore()).isEqualTo(1);
    }

    @Test
    public void 이름5이하() {
        assertThatThrownBy(() ->
                new Car("asdlkfjasdlfjsdaklfj")).isInstanceOf(InvalidParameterException.class);

    }

    @Test
    public void 프린트() {
        Car car = new Car("foo");
        car.run(5);
        String printStr = car.getMessage();
        assertThat(printStr).isEqualTo("foo : -");
        car.run(5);
        String printStr2 = car.getMessage();
        assertThat(printStr2).isEqualTo("foo : --");
    }
}