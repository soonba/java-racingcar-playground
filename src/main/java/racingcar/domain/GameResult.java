package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class GameResult {

    private final List<String> resultList = new ArrayList<>();

    public void apply(String print) {
        resultList.add(print);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for (String s : resultList) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }
}
