package racingcar;

public class Car {

    private final String name;
    private int score = 0;

    public Car(String name) {
        this.name = name;
    }

    public void run(int number) {
        if(number>=4) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }

    public String getMessage() {
        return name+ " : " + getBar();
    }

    private String getBar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < score; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}