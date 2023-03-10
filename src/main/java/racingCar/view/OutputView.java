package racingCar.view;

import racingCar.domain.Car;
import racingCar.domain.GameResult;

import java.util.List;

public class OutputView {


    public static void initCarsMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void initTimesMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void initGameMessage() {
        System.out.println("실행 결과");
    }

    public static void printResult(GameResult gameResult) {
        System.out.println(gameResult.getResult());
    }

    public static void printWinners(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        for (Car winner : winners) {
            sb.append(winner.getName()).append(",");
        }
        String winnersString = sb.substring(0, sb.length() - 1);
        System.out.println(winnersString + "가 최종 우승하였습니다.");
    }

    public static void printErrorMessage(String message) {
        System.out.println(message);
    }
}
