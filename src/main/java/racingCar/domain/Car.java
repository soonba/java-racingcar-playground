package racingCar.domain;

public class Car {
    private final String name;
    private Position position;

    private static final Integer MINIMUM_NUMBER_TO_MOVE = 4;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, Integer position) {
        this.name = validate(name);
        this.position = new Position(position);
    }

    public void run(int randomNo) {
        if (randomNo >= MINIMUM_NUMBER_TO_MOVE) {
            this.position = position.move();
        }
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    private String validate(String name) {
        if (name.length() > 5) throw new IllegalArgumentException("이름은 5자를 초과할 수 없음");
        return name;
    }

    public boolean isSamePosition(Position position1) {
        return this.position.equals(position1);
    }
}
