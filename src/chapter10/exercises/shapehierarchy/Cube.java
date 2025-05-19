package chapter10.exercises.shapehierarchy;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getArea() {
        return 6 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public String getName() {
        return "Cube";
    }

    public String toString() {
        return String.format("%s [side=%.2f, area=%.2f, volume=%.2f]", getName(), side, getArea(), getVolume());
    }
}
