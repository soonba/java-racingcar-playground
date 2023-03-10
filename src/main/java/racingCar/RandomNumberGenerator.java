package racingCar;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    private static final int MAX = 9;
    private static final int MIN = 0;

    public static int apply() {
        return MIN + ThreadLocalRandom.current().nextInt(MAX - MIN + 1);
    }
}
