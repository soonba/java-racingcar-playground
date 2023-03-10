package racingCar.view;

import racingCar.domain.Car;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<Car> initCars() throws Exception {
        String carString = br.readLine();
        String[] split = carString.split(",");
        List<Car> cars = new ArrayList<>();
        for (String s : split) cars.add(new Car(s));
        return cars;
    }

    public static Integer initTime() throws Exception {
        return Integer.parseInt(br.readLine());
    }
}
