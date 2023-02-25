package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {

    static Cars testCars;

    @BeforeEach
    void setup() {
        testCars = new Cars("a,b,c,d");
    }

    @Test
    void 승자() {
        testCars.race(0, 5);
        testCars.race(1, 3);
        testCars.race(2, 4);
        testCars.race(3, 9);
        List<Car> winner = testCars.getWinner();
        assertThat(winner.get(0).getScore()).isEqualTo(1);
        assertThat(winner.get(1).getScore()).isEqualTo(1);
        assertThat(winner.get(2).getScore()).isEqualTo(1);
    }

    @Test
    void 파싱() {
        Cars cars = new Cars("aa,db,-c,d1");
        assertThat(cars.size()).isEqualTo(4);
    }

    @Test
    void 결과() {
        testCars.race(0, 5);
        testCars.race(1, 3);
        testCars.race(2, 4);
        testCars.race(3, 9);
        GameResult result = testCars.getResult();
        System.out.println(result.print());
    }

}
