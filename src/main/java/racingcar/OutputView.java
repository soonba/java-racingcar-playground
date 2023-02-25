package racingcar;

import java.security.InvalidParameterException;
import java.util.List;

public class OutputView {
    public static void initNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void initTests() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printResult(Cars cars) {
        GameResult result = cars.getResult();
        System.out.println(result.print());
    }

    public static void printWinner(Cars cars) {
        StringBuilder sb = new StringBuilder();
        List<Car> winners = cars.getWinner();
        winners.forEach(car -> sb.append(car.getName()).append(", "));
        String names = sb.substring(0, sb.length() - 2);
        System.out.println(names + "가 최종 우승했습니다.");
    }

    public static void printInvalidParameterException(InvalidParameterException e) {
        System.out.println(e.getMessage());
        System.out.println("게임을 다시 시작해주세요.");
    }
}
