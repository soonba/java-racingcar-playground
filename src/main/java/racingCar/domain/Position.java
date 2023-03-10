package racingCar.domain;

import java.util.Objects;

public class Position {
    private final Integer value;

    public Position(int value) {
        this.value = validate(value);
    }

    public Position move() {
        return new Position(value + 1);
    }

    private Integer validate(int value) {
        if (value < 0) throw new IllegalArgumentException("포지션은 음수가 아닙니다.");
        return value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return value.equals(position.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String getBars() {
        return "-".repeat(value);
    }
}
