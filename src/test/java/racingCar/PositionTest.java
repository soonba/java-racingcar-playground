package racingCar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingCar.domain.Position;

public class PositionTest {

    @Test
    void 포지션은_0이상() {
        Assertions.assertThatThrownBy(() -> new Position(-1)).isInstanceOf(IllegalArgumentException.class);
    }
}
