package chapter10.exercises.shapehierarchy;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }

    public String toString() {
        return String.format("%s [side=%.2f, area=%.2f]", getName(), side, getArea());
    }
}
