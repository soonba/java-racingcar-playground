package racingcar.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String getCarNames() throws IOException {
        return br.readLine();
    }

    public static Integer getRaceTime() throws IOException {
        return Integer.parseInt(br.readLine());
    }
}
