package racingcar;

import java.security.InvalidParameterException;

public class Car {

    private static final Integer MINIMUM_NUMBER_TO_GET_SCORE = 4;

    private final String name;
    private int score = 0;


    public Car(String name) throws InvalidParameterException{
        this.name = validate(name);
    }

    public void run(int number) {
        if(number >= MINIMUM_NUMBER_TO_GET_SCORE) {
            score++;
        }
    }

    private String validate (String name) throws InvalidParameterException{
        if(name.length() > 5) throw new InvalidParameterException("이름은 5자를 넘길 수 없습니다.");
        return name;
    }

    public String print() {
        return name + " : " + getBar();
    }

    private String getBar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < score; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
