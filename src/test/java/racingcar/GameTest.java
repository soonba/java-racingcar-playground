package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {

    static Game testGame;

    @BeforeEach
    void setup() {
        testGame = new Game("a,b,c,d");
    }

    @Test
    void 승자() {
        testGame.race(0, 5);
        testGame.race(1, 3);
        testGame.race(2, 4);
        testGame.race(3, 9);
        List<Car> winner = testGame.getWinner();
        assertThat(winner.get(0).getScore()).isEqualTo(1);
        assertThat(winner.get(1).getScore()).isEqualTo(1);
        assertThat(winner.get(2).getScore()).isEqualTo(1);
    }

    @Test
    void 파싱() {
        Game game = new Game("aa,db,-c,d1");
        assertThat(game.size()).isEqualTo(4);
    }

    @Test
    void 결과() {
        testGame.race(0, 5);
        testGame.race(1, 3);
        testGame.race(2, 4);
        testGame.race(3, 9);
        GameResult result = testGame.getResult();
        System.out.println(result.print());
    }

}
