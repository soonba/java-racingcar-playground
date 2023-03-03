package racingcar;

import java.io.IOException;

public class RacingCarApplication {
    public static void main(String[] args) throws IOException {
        RacingController racingController = new RacingController();
        racingController.run();
    }
}
