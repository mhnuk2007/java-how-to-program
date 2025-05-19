package chapter10.exercises.shapehierarchy;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "Circle";
    }

    public String toString() {
        return String.format("%s [radius=%.2f, area=%.2f]", getName(), radius, getArea());
    }
}
